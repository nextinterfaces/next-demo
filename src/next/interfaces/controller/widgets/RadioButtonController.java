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
import next.i.view.widgets.XFlexTable;
import next.i.view.widgets.XLabel;
import next.i.view.widgets.XRadioButton;
import next.i.view.widgets.XRadioButtonGroup;
import next.i.view.widgets.XLabel.XLabelType;
import next.interfaces.controller.GitXController;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.IsWidget;

public class RadioButtonController extends GitXController {

	public RadioButtonController() {
		setTitle("Radio Button");
	}

	@Override
	public IsWidget getViewContent() {

		XFlexTable panel = new XFlexTable();
		panel.setCellSpacing(20);

		XRadioButton radio0 = new XRadioButton("Red", "Red");
		XRadioButton radio1 = new XRadioButton("Green", "Green");
		XRadioButton radio2 = new XRadioButton("Blue", "Blue");

		final XRadioButtonGroup group1 = new XRadioButtonGroup(true);
		group1.add(radio0, radio1, radio2);

		XRadioButton radioA = new XRadioButton("Red", "Red");
		XRadioButton radioB = new XRadioButton("Green", "Green");
		XRadioButton radioC = new XRadioButton("Blue", "Blue");

		final XRadioButtonGroup group2 = new XRadioButtonGroup(false);
		group2.add(radioA, radioB, radioC);

		final XLabel label1 = new XLabel("Favorite color", XLabelType.Header);
		final XLabel label2 = new XLabel("Favorite color", XLabelType.Header);

		radio0.setValue(true);
		radioA.setValue(true);
		
		group1.addSelectionChangedHandler(new SelectionChangedHandler() {
			public void onSelectionChanged(SelectionChangedEvent e) {
				label1.setText("Favorite color: " + group1.getCheckedWidget().getName());
			}
		});

		group2.addSelectionChangedHandler(new SelectionChangedHandler() {
			public void onSelectionChanged(SelectionChangedEvent e) {
				label2.setText("Favorite color: " + group2.getCheckedWidget().getName());
			}
		});

		panel.addWidgets(label2, group2, label1, group1, new HTML("&nbsp;"));

		return panel;
	}

	public String getGitPath() {
		return "/controller/widgets/RadioButtonController";
	}

}
