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
import next.i.view.widgets.XProgress;
import next.interfaces.controller.GitXController;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.IsWidget;

public class ProgressController extends GitXController {

	public ProgressController() {
		setTitle("Progress");
	}

	@Override
	public IsWidget getViewContent() {
		XFlexTable panel = new XFlexTable();
		panel.setCellSpacing(40);

		final XProgress progress = new XProgress();
		// progress.setTransistionTiming(1000);
		XButton btn = new XButton("Start Progress");

		btn.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				if(!progress.isRunning()){
					progress.reset();
					runProgress(0, progress);
				}
			}
		});

		panel.addWidgets(btn, progress);

		return panel;
	}

	private void runProgress(final double percent, final XProgress progress) {
		if (percent > 1.0) {
			// isRunning = false;
			return;
		}
		progress.setValue(percent);
		new Timer() {
			public void run() {
				runProgress(percent + 0.1, progress);
			}
		}.schedule(600);
	}

	public String getGitPath() {
		return "/controller/widgets/ProgressController";
	}

}
