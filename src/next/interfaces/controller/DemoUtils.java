/*
 * Copyright 2011 Vancouver Ywebb Consulting Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package next.interfaces.controller;

import next.i.view.CellData;
import next.i.view.XDragScrollView;
import next.i.view.widgets.XButton;
import next.i.view.widgets.XButton.XButtonType;
import next.i.view.widgets.XFlexTable;
import next.i.view.widgets.XPopup;
import next.i.view.widgets.XSpinner;
import next.interfaces.Globals;
import next.interfaces.HTTP;
import next.interfaces.ResponseReader;

import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;

public class DemoUtils {

	public static CellData[] DATA;

	static {
		DATA = populate();
	}

	private static CellData[] populate() {

		String[] names = { "Argentina", "Bolivia", "Brazil", "Chile", "Colombia", "Costa Rica", "Cuba",
				"Dominican Republic", "Ecuador", "El Salvador", "Guatemala", "Honduras", "Mexico", "Nicaragua", "Panama",
				"Paraguay", "Peru", "Puerto Rico", "Uruguay", "Venezuela" };

		int len = names.length;
		CellData[] arr = new CellData[len];
		for (int i = 0; i < len; i++) {
			arr[i] = new CellData(names[i]);
		}

		return arr;
	}

	public static native void openURL(String url)/*-{
		$wnd.open(url, 'target=_blank');
	}-*/;

	public static void openGit(final String url) {
		openGit(null, url);
	}

	public static void openGit(String source, final String url) {

		final XFlexTable tbl = new XFlexTable();

		final XButton btnCopy = new XButton("Copy", XButtonType.Shadow);
		btnCopy.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				markText(tbl.getWidget(0, 0).getElement());
			}
		});

		final XButton btnGit = new XButton("View in GitHub", XButtonType.Shadow);
		btnGit.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				// Window.open(Globals.GIT_HOST + url + ".java", "_tab", "");
				// Utils.loadUrl(Globals.GIT_HOST + url + ".java");

				// This click handler seems to work best
				openURL(Globals.GIT_HOST + url + ".java");
			}
		});

		tbl.getElement().setId("codeText");
		String codeUrl = url.substring(url.lastIndexOf("/") + 1);
		HTTP.doGet(Globals.SOURCE_PATH.replace("$", codeUrl), new ResponseReader() {
			public void onSuccess(Response resp) {
				tbl.setWidget(0, 0, new HTML("<pre>" + toHighlighted(resp.getText()) + "</pre>"));
				tbl.setWidget(1, 0, btnCopy);
				tbl.setWidget(1, 1, btnGit);
			}
		});

		final XPopup popup = new XPopup();
		XDragScrollView view = new XDragScrollView();
		view.addStyleName("codeDemo");

		tbl.setWidget(0, 0, new XSpinner());
		tbl.setCellSpacing(10);

		FlexCellFormatter fcf = tbl.getFlexCellFormatter();
		fcf.setVerticalAlignment(0, 0, HasVerticalAlignment.ALIGN_TOP);
		fcf.setHorizontalAlignment(0, 0, HasHorizontalAlignment.ALIGN_LEFT);
		fcf.setVerticalAlignment(1, 0, HasVerticalAlignment.ALIGN_TOP);
		fcf.setHorizontalAlignment(1, 0, HasHorizontalAlignment.ALIGN_RIGHT);
		fcf.setVerticalAlignment(1, 1, HasVerticalAlignment.ALIGN_TOP);
		fcf.setHorizontalAlignment(1, 1, HasHorizontalAlignment.ALIGN_LEFT);
		fcf.setColSpan(0, 0, 2);
		fcf.setWidth(1, 0, "50%");
		fcf.setWidth(1, 1, "50%");
		view.add(tbl);

		int h = Window.getClientHeight();
		int w = Window.getClientWidth();
		popup.setWidget(view);

		// mobile phone
		if (h + w < 1000) {
			popup.setTop("35px");
			popup.setRight("5%");
			popup.setLeft("5%");
			popup.setBottom("40px");

		} else {
			popup.setTop("35px");
			popup.setRight("5%");
			popup.setLeft("10%");
			popup.setBottom("30%");
		}

		popup.show();
	}

	private static native void markText(Element elem) /*-{
		if ($doc.selection && $doc.selection.createRange) {
			var range = $doc.selection.createRange();
			range.moveToElementText(elem);
			range.select();
		} else if ($doc.createRange && $wnd.getSelection) {
			var range = $doc.createRange();
			range.selectNode(elem);
			var selection = $wnd.getSelection();
			selection.removeAllRanges();
			selection.addRange(range);
		}
	}-*/;

	private static String toHighlighted(String code) {

		String[] keywords = { "new ", "public ", "private ", "return ", "static ", "class ", "native ", "final ",
				"extends " };

		code = code.replace("=", "<span class='codeGray'>=</span>");
		code = code.replace(".", "<span class='codeGray'>.</span>");
		code = code.replace(":", "<span class='codeGray'>:</span>");
		code = code.replace(",", "<span class='codeGray'>,</span>");
		code = code.replace(";", "<span class='codeGray'>;</span>");
		code = code.replace("@Override", "<span class='codeGray'>@Override</span>");
		code = code.replace("true", "<span class='codePink'>true</span>");
		code = code.replace("false", "<span class='codePink'>false</span>");
		for (String k : keywords) {
			code = code.replace(k, "<span class='codeWord'>" + k.trim() + "</span> ");
		}

		code = replaceEclosed('"', "codeQuot", code);
		code = code.replace("/*-{", "<span class='codeJSNI'>/*-{");
		code = code.replace("}-*/", "}-*/</span>");
		code = code.replace("/***", "<span class='codeGray'>//");
		code = code.replace("***/", "</span>");

		return code;
	}

	private static String replaceEclosed(char char_, String className, String code) {
		int count = 0;
		char[] chars = code.toCharArray();

		StringBuilder buff = new StringBuilder();

		for (char c : chars) {
			if (char_ == c) {
				if (count % 2 == 0) {
					buff.append("<span class='" + className + "'>\"");

				} else {
					buff.append("\"</span>");

				}
				count++;
			} else {
				buff.append(c);
			}
		}

		return buff.toString();
	}

}
