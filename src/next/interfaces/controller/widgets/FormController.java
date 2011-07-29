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

import next.i.view.widgets.XFlexTable;
import next.i.view.widgets.XTextField;
import next.i.view.widgets.XTextField.XTextFieldType;
import next.interfaces.controller.GitXController;

import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.google.gwt.user.client.ui.IsWidget;

public class FormController extends GitXController {

	public FormController() {
		setTitle("Form");
	}

	@Override
	public IsWidget getViewContent() {

		XFlexTable panel = new XFlexTable(null, "#fff");
		panel.setCellSpacing(0);

		XTextField text = new XTextField("Text", null);
		XTextField password = new XTextField("Password", XTextFieldType.PASSWORD);
		XTextField email = new XTextField("Email", XTextFieldType.EMAIL);
		XTextField number = new XTextField("Number", XTextFieldType.NUMBER);
		XTextField tel = new XTextField("Tel", XTextFieldType.TEL);
		XTextField url = new XTextField("URL", XTextFieldType.URL);
		XTextField textarea = new XTextField("Text Area", XTextFieldType.TEXTAREA);
		panel.addWidgets(text, password, email, number, tel, url, textarea);

		FlexCellFormatter fcf = panel.getFlexCellFormatter();
		for (int i = 0; i < panel.getRowCount(); i++) {
			fcf.setHeight(i, 0, "50px");
		}
		return panel;
	}

	public String getGitPath() {
		return "/controller/widgets/FormController";
	}

}
