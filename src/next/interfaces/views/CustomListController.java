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
package next.interfaces.views;

import next.i.view.XTableCell;
import next.i.view.XTableCellData;
import next.i.view.XTableView;
import next.i.view.widgets.XSlider;
import next.i.view.widgets.XSwitch;
import next.interfaces.controller.GitXController;

import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;

public class CustomListController extends GitXController {

	public CustomListController() {
		setTitle("Lists");
	}

	@Override
	public IsWidget getViewContent() {

		XTableCellData d0 = new XTableCellData();
		d0.setWestWidgets(new Image("images/icons/list0.png"));
		d0.setTextWidgets(new Label("Ariplane Mode"));
		d0.setEastWidgets(new XSwitch(true));
		XTableCell c0 = new XTableCell(d0);

		XTableCellData d1 = new XTableCellData();
		d1.setWestWidgets(new Image("images/icons/list1.png"));
		d1.setTextWidgets(new Label("WI-FI"));
		d1.setEastWidgets(new Image("images/icons/list1a.png"));
		XTableCell c1 = new XTableCell(d1);

		XTableCellData d2 = new XTableCellData();
		d2.setWestWidgets(new Image("images/icons/list2.png"));
		d2.setTextWidgets(new Label("Notifications"));
		d2.setEastWidgets(new Image("images/icons/list2a.png"));
		XTableCell c2 = new XTableCell(d2);

		XTableCellData d3 = new XTableCellData();
		d3.setWestWidgets(new Image("images/icons/list3.png"));
		d3.setTextWidgets(new Label("Sound"));
		d3.setEastWidgets(new XSlider(60));
		XTableCell c3 = new XTableCell(d3);

		XTableView tableView = new XTableView();
		tableView.addItem(c0, c1, c2, c3);

		return tableView;
	}

	public String getGitPath() {
		return "/views/CustomListController";
	}

}
