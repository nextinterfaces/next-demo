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
import next.i.view.widgets.XSwitch;
import next.interfaces.controller.GitXController;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.IsWidget;

public class SwitchController extends GitXController {

	public SwitchController() {
		setTitle("Switch");
	}

	@Override
	public IsWidget getViewContent() {
		XFlexTable panel = new XFlexTable();
		panel.setCellSpacing(40);

		final HTML label = new HTML("Switch is OFF");
		XSwitch switchBtn = new XSwitch(true);
		switchBtn.addValueChangeHandler(new ValueChangeHandler<Boolean>() {			
			@Override
			public void onValueChange(ValueChangeEvent<Boolean> e) {
				label.setHTML("Switch is " + (e.getValue()? "ON&nbsp;&nbsp;" : "OFF"));
			}
		});

		panel.addWidgets(switchBtn, label);

		return panel;
	}

	public String getGitPath() {
		return "/controller/widgets/SwitchController";
	}

}
