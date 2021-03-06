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
package next.interfaces.controller.animation;

import next.i.controller.XController;
import next.i.view.XBarItem.Type;
import next.i.view.widgets.XFlexTable;
import next.interfaces.controller.DemoUtils;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.IsWidget;

public class DragController extends XController {

	public DragController() {
		setTitle("Drag Scroll");

		getNavigationBar().setLeftTitle("Back", Type.BACK_BUTTON);
		getNavigationBar().getLeftButton().addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				getNavigationController().popController(true);
			}
		});

		getNavigationBar().setRightTitle("Source");
		getNavigationBar().getRightButton().addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				DemoUtils.openGit(getGitPath());
			}
		});
	}

	@Override
	public Scroll getScrollOrientation() {
		return XController.Scroll.DRAGGABLE;
	}

	@Override
	public IsWidget getViewContent() {
		XFlexTable panel = new XFlexTable("100%", null);
		panel.addWidgets(new Image("images/icons/simpsonXY.jpg"), null);
//		panel.setWidth("1000px");
		FlexCellFormatter fcf = panel.getFlexCellFormatter();
		fcf.setVerticalAlignment(0, 0, HasVerticalAlignment.ALIGN_MIDDLE);
		return panel;
	}

	public String getGitPath() {
		return "/controller/animation/DragController";
	}

}
