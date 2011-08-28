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

import next.i.view.XBarItem.Type;
import next.i.view.XNavigationBar;
import next.interfaces.controller.GitXController;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.VerticalPanel;

public class NavigationBarController extends GitXController {

	public NavigationBarController() {
		setTitle("Navigation Bar");
	}

	@Override
	public IsWidget getViewContent() {

		VerticalPanel panel = new VerticalPanel();
		panel.setWidth("100%");
		panel.getElement().getStyle().setProperty("background", "#f8f8f8");
		panel.getElement().getStyle().setProperty("padding", "40px 20px"); 

		XNavigationBar bar1 = new XNavigationBar();
		bar1.setTitle("Bar One");
		bar1.getElement().getStyle().setProperty("height", "30px");
		panel.add(bar1);

		panel.add(new HTML("&nbsp;"));
		
		XNavigationBar bar2 = new XNavigationBar();
		bar2.setLeftTitle("Back", Type.BACK_BUTTON);
		bar2.getLeftButton().addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				Window.alert("Back was tapped.");
			}
		});
		bar2.setTitle("Bar Two");
		panel.add(bar2);
		panel.add(new HTML("&nbsp;"));

		XNavigationBar bar3 = new XNavigationBar();
		bar3.setTitle("Bar Three");
		bar3.getElement().getStyle().setProperty("height", "60px");

		bar3.setLeftTitle("Edit", Type.BUTTON);
		bar3.getLeftButton().addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				Window.alert("Edit was tapped.");
			}
		});
		bar3.setRightTitle("Done");
		bar3.getRightButton().addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				Window.alert("Done was tapped.");
			}
		});

		panel.add(bar3);

		return panel;
	}

	public String getGitPath() {
		return "/widgets/NavigationBarController";
	}

}
