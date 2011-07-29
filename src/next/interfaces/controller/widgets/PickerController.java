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
import next.i.view.widgets.XPicker;
import next.interfaces.controller.GitXController;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.IsWidget;

public class PickerController extends GitXController {

	public PickerController() {
		setTitle("Picker");
	}

	@Override
	public IsWidget getViewContent() {
		XFlexTable panel = new XFlexTable();
		panel.setCellSpacing(40);

		XPicker picker = new XPicker();
		picker.add("Castle in the Sky");
		picker.add("Totoro");
		picker.add("Spirited Away");
		picker.add("Ponyo", true);
		picker.addValueChangeHandler(new ValueChangeHandler<String>() {
			public void onValueChange(ValueChangeEvent<String> e) {
				// Window.alert("You selected " + e.getValue() + " type=" + e.getType()
				// + " src=" + e.getSource());
			}
		});

		panel.addWidgets(picker);

		return panel;
	}

	public String getGitPath() {
		return "/controller/widgets/PickerController";
	}

}
