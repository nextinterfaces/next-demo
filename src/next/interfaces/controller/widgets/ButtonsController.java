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
import next.i.view.widgets.XButton.XButtonType;
import next.i.view.widgets.XFlexTable;
import next.interfaces.controller.GitXController;

import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;

public class ButtonsController extends GitXController {

	public ButtonsController() {
		setTitle("Buttons");
	}

	@Override
	public IsWidget getViewContent() {
		XFlexTable panel = new XFlexTable();
		// panel.setCellSpacing(30);
		panel.getElement().getStyle().setProperty("paddingLeft", "100px");

		XButton btnDefault = new XButton("Rounded Default");
		XButton btnNav = new XButton("Navigation", XButtonType.Navigation);
		XButton btnShadow = new XButton("Shadow", XButtonType.Shadow);

		XButton btnAdd = new XButton("Add", XButtonType.Add);
		XButton btnDisclRight = new XButton("Disclosure", XButtonType.Disclosure, false);

		panel.addWidgets(HasHorizontalAlignment.ALIGN_LEFT, btnDefault, btnNav, btnShadow, btnAdd, btnDisclRight);

		SimplePanel wrapper = new SimplePanel();
		wrapper.setHeight("100%");
		wrapper.add(panel);
		return wrapper;
	}

	public String getGitPath() {
		return "/controller/widgets/ButtonsController";
	}

}
