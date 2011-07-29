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
package next.interfaces.controller.widgets;

import next.i.view.widgets.XButton;
import next.i.view.widgets.XFlexTable;
import next.i.view.widgets.XButton.XButtonType;
import next.interfaces.controller.GitXController;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.IsWidget;

public class ButtonsController extends GitXController {

	public ButtonsController() {
		setTitle("Buttons");
	}

	@Override
	public IsWidget getViewContent() {
		XFlexTable panel = new XFlexTable();
		panel.setCellSpacing(30);

		XButton btnDefault = new XButton("Rounded Default");
		XButton btnNav = new XButton("Navigation", XButtonType.Navigation);
		XButton btnShadow = new XButton("Shadow", XButtonType.Shadow);

		XButton btnAdd = new XButton("Add", XButtonType.Add);
		XButton btnDisclLeft = new XButton("Disclosure", XButtonType.Disclosure);
		XButton btnDark = new XButton("InfoDark", XButtonType.InfoDark);
		XButton btnLight = new XButton("InfoLight", XButtonType.InfoLight);

		XButton btnAddRight = new XButton("Add ", XButtonType.Add, false);
		XButton btnDisclRight = new XButton("Disclosure", XButtonType.Disclosure, false);
		XButton btnDarkRight = new XButton("InfoDark", XButtonType.InfoDark, false);
		XButton btnLightRight = new XButton("InfoLight", XButtonType.InfoLight, false);

		panel.addWidgets(HasHorizontalAlignment.ALIGN_LEFT, btnDefault, btnNav, btnShadow, btnAdd, btnDisclRight);

//		ClickHandler handler = new ClickHandler() {
//			public void onClick(ClickEvent e) {
//				Window.alert("Hello. I was tapped.");
//			}
//		};
//
//		addClickHandler(handler, btnDefault, btnNav, btnShadow, btnAdd, btnDisclLeft, btnDark, btnLight, btnAddRight,
//				btnDisclRight, btnDarkRight, btnLightRight);

		return panel;
	}

//	private void addClickHandler(ClickHandler handler, XButton... btns) {
//		for (XButton b : btns) {
//			b.addClickHandler(handler);
//		}
//	}

	public String getGitPath() {
		return "/controller/widgets/ButtonsController";
	}

}
