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
 * @author Atanas Roussev
 */
import next.i.controller.XNavigationController;
import next.i.controller.XTabBarController;
import next.i.controller.XTabController;
import next.interfaces.controller.animation.TransitionsController;
import next.interfaces.controller.widgets.WidgetsController;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;

public class Main implements EntryPoint {

	public void onModuleLoad() {

		RootLayoutPanel.get().getElement().setId("rootLayoutPanel");

		XTabController tabAnimeCtrl = new XTabController(new XNavigationController(new TransitionsController()));
		tabAnimeCtrl.set("Animations", new Image("images/icons/tab0.png"), new Image("images/icons/tab0-selected.png"));

		XTabController tabWidgetsCtrl = new XTabController(new XNavigationController(new WidgetsController()));
		tabWidgetsCtrl.set("Widgets", new Image("images/icons/tab3.png"), new Image("images/icons/tab3-selected.png"));

		XTabBarController tabBarController = new XTabBarController();
		tabBarController.addControllers(tabWidgetsCtrl, tabAnimeCtrl);

		RootPanel.get("loading").setVisible(false);
	}
}
