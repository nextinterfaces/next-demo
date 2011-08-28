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

import next.i.view.CellData;
import next.i.view.XTableCell;
import next.i.view.XTableView;
import next.i.view.widgets.XSlider;
import next.i.view.widgets.XSwitch;
import next.interfaces.controller.GitXController;

import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;

public class ListController extends GitXController {

	public ListController() {
		setTitle("Lists");
	}

	@Override
	public IsWidget getViewContent() {

		CellData data = new CellData();
		data.setWestWidgets(new Image("images/icons/list0.png"));
		data.setTextWidgets(new Label("Ariplane Mode"));
		data.setEastWidgets(new XSwitch(true));
		XTableCell c0 = new XTableCell(data);

		data = new CellData();
		data.setWestWidgets(new Image("images/icons/list1.png"));
		data.setTextWidgets(new Label("WI-FI"));
		data.setEastWidgets(new Image("images/icons/list1x.png"));
		XTableCell c1 = new XTableCell(data);

		data = new CellData();
		data.setWestWidgets(new Image("images/icons/list2.png"));
		data.setTextWidgets(new Label("Notifications"));
		data.setEastWidgets(new Image("images/icons/list2x.png"));
		XTableCell c2 = new XTableCell(data);

		data = new CellData();
		data.setWestWidgets(new Image("images/icons/list3.png"));
		data.setTextWidgets(new Label("Sound"));
		data.setEastWidgets(new XSlider(60));
		XTableCell c3 = new XTableCell(data);

		XTableView tableView = new XTableView();
		tableView.addItem(c0, c1, c2, c3);

		return tableView;
	}

	public String getGitPath() {
		return "/widgets/ListController";
	}

}
