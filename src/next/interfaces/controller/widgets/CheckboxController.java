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

import next.i.mobile.SelectionChangedEvent;
import next.i.mobile.SelectionChangedHandler;
import next.i.view.widgets.XCheckbox;
import next.i.view.widgets.XCheckboxGroup;
import next.i.view.widgets.XFlexTable;
import next.i.view.widgets.XLabel;
import next.i.view.widgets.XLabel.XLabelType;
import next.interfaces.controller.GitXController;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.IsWidget;

public class CheckboxController extends GitXController {

	public CheckboxController() {
		setTitle("Checkbox");
	}

	@Override
	public IsWidget getViewContent() {

		XFlexTable panel = new XFlexTable();
		panel.setCellSpacing(20);

		XCheckbox check0 = new XCheckbox("Red", "Red");
		XCheckbox check1 = new XCheckbox("Green", "Green");
		XCheckbox check2 = new XCheckbox("Blue", "Blue");

		final XCheckboxGroup group1 = new XCheckboxGroup(true);
		group1.add(check0, check1, check2);

		XCheckbox checkA = new XCheckbox("Red", "Red");
		XCheckbox checkB = new XCheckbox("Green", "Green");
		XCheckbox checkC = new XCheckbox("Blue", "Blue");
		final XCheckboxGroup group2 = new XCheckboxGroup(false);
		group2.add(checkA, checkB, checkC);

		final XLabel label1 = new XLabel("Favorite color", XLabelType.Header);
		final XLabel label2 = new XLabel("Favorite color", XLabelType.Header);

		panel.addWidgets(label2, group2, label1, group1, new HTML("&nbsp;"));

		group1.addSelectionChangedHandler(new SelectionChangedHandler() {
			public void onSelectionChanged(SelectionChangedEvent e) {
				String s = "Favorite color: ";
				for (XCheckbox c : group1.getCheckedWidgets()) {
					s += c.getName() + ", ";
				}
				label1.setText(s);
			}
		});

		group2.addSelectionChangedHandler(new SelectionChangedHandler() {
			public void onSelectionChanged(SelectionChangedEvent e) {
				String s = "Favorite color: ";
				for (XCheckbox c : group2.getCheckedWidgets()) {
					s += c.getName() + ", ";
				}
				label2.setText(s);
			}
		});

		return panel;
	}

	public String getGitPath() {
		return "/controller/widgets/CheckboxController";
	}

}
