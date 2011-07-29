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
import next.i.view.widgets.XSlider;
import next.interfaces.controller.GitXController;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;

public class SliderController extends GitXController {

	public SliderController() {
		setTitle("Slider");
	}

	@Override
	public IsWidget getViewContent() {
		XFlexTable panel = new XFlexTable();
		panel.setCellSpacing(40);

		HTML label = new HTML("&nbsp;");

		XSlider slider1 = new XSlider(75);
		XSlider slider2 = new XSlider(100);
		XSlider slider3 = new XSlider(35);

		addHandlers(label, slider1, slider2, slider3);

		panel.addWidgets(slider1, slider2, slider3, label);

		return panel;
	}

	private void addHandlers(final Label label, XSlider... sliders) {
		for (final XSlider s : sliders) {
			s.addValueChangeHandler(new ValueChangeHandler<Integer>() {
				public void onValueChange(ValueChangeEvent<Integer> event) {
					label.setText("Slided at: " + s.getValue() + "%");
				}
			});
		}
	}

	public String getGitPath() {
		return "/controller/widgets/SliderController";
	}

}
