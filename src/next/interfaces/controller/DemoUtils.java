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
import next.i.view.widgets.XPopup;
import next.interfaces.Globals;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

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

		XButton btn = new XButton("View in GitHub", XButtonType.Shadow);
		btn.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				// Window.open(Globals.GIT_HOST + url + ".java", "_tab", "");
				// Utils.loadUrl(Globals.GIT_HOST + url + ".java");
				// This click handler seems to work best
				openURL(Globals.GIT_HOST + url + ".java");
			}
		});

		final XPopup popup = new XPopup();
		XDragScrollView view = new XDragScrollView();
		
		view.add(btn);
		
		popup.setWidget(view);
		popup.setTop("20%");
		popup.setRight("20%");
		popup.setLeft("20%");
		popup.setBottom("20%");
		
		popup.show();
	};

}
