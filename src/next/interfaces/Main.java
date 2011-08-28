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
package next.interfaces;

/**
 * Main entry point class
 */
import next.i.HistoryController;
import next.i.controller.XNavigationController;
import next.i.controller.XTabBarController;
import next.i.controller.XTabController;
import next.i.view.XDragScrollView;
import next.i.view.widgets.XButton;
import next.i.view.widgets.XPopup;
import next.interfaces.controller.animation.AnimationsController;
import next.interfaces.controller.widgets.WidgetsController;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class Main implements EntryPoint {

	public void onModuleLoad() {

//		HTML div = new HTML("[___HTML___]");
////		div.setStyleName("dragDiv");
////		XHorizontalScrollView dragPanel = new XHorizontalScrollView();
//		XDragScrollView dragPanel = new XDragScrollView();
//		dragPanel.addStyleName("xpopup");
//		dragPanel.add(div);
////		dragPanel.add(new Image("images/icons/simpsonXY.jpg"));
//		
//		final XPopup3 popup = new XPopup3();
//		popup.setWidget(dragPanel);
////		popup.center();
//		popup.setTop("5em");
//		popup.setBottom("5em");
//		popup.setLeft("5em");
//		popup.setRight("5em");
//
//		XButton btn = new XButton("Open");
//		btn.addClickHandler(new ClickHandler() {
//			public void onClick(ClickEvent event) {
//				popup.show();
//			}
//		});
//		RootLayoutPanel.get().add(new HTML("<p style='border: 1px solid #333; padding: 50px;'>[______DIV 1________]"));
//		RootLayoutPanel.get().add(btn); //new HTML("<p style='border: 1px solid #ff55ff; padding: 50px;'>[______DIV 2________]"));
//		
//		popup.show();
		
//		SimplePanel wrapper = new SimplePanel();
//		wrapper.setStyleName("scrollWrapper");
//		wrapper.setWidget(dragPanel);
//		RootLayoutPanel.get().add(wrapper);
////		RootLayoutPanel.get().add(view);
//
//		final XPopup2 popup = new XPopup2();
//		popup.setWidget(dragPanel);
//		popup.setTop(20.0, Unit.PCT);
//		popup.setRight(20., Unit.PCT);
//		popup.setBottom(20., Unit.PCT);
//		popup.setLeft(20., Unit.PCT);
//		popup.show();
//		XButton btn = new XButton("Open");
//		btn.addClickHandler(new ClickHandler() {
//			public void onClick(ClickEvent event) {
//				popup.show();
//			}
//		});
//		RootLayoutPanel.get().add(btn);
		
		Scheduler.get().scheduleDeferred(new ScheduledCommand() {
			@Override
			public void execute() {

				XTabController tabAnimeCtrl = new XTabController(new XNavigationController(new AnimationsController()));
				tabAnimeCtrl.set("Animations", new Image("images/icons/tab0.png"), new Image("images/icons/tab0-selected.png"));

				XTabController tabWidgetsCtrl = new XTabController(new XNavigationController(new WidgetsController()));
				tabWidgetsCtrl.set("Widgets", new Image("images/icons/tab3.png"), new Image("images/icons/tab3-selected.png"));

				XTabBarController tabBarController = new XTabBarController();
				tabBarController.addControllers(tabWidgetsCtrl, tabAnimeCtrl);

				RootPanel.get("loading").setVisible(false);

				new HistoryController().register("start");
			}
		});
		
	}
}
