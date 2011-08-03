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
import next.i.view.XTableView;
import next.interfaces.controller.GitXController;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.IsWidget;

public class SimpleListController extends GitXController {

	public SimpleListController() {
		setTitle("List");
	}

	@Override
	public IsWidget getViewContent() {

		XTableView tableView = new XTableView();

		XTableCell c0 = new XTableCell("British Columbia");
		XTableCell c1 = new XTableCell("California");
		XTableCell c2 = new XTableCell("Minnesota");
		XTableCell c3 = new XTableCell("New Jersey");
		XTableCell c4 = new XTableCell("Oregon");
		XTableCell c5 = new XTableCell("Washington");
		XTableCell c6 = new XTableCell("Quebec");

		add(tableView, c0, c1, c2, c3, c4, c5, c6);

		return tableView;
	}

	private void add(XTableView view, XTableCell... cells) {
		for (XTableCell c : cells) {

			view.addItem(c);
//			c.showChevron(true);
			c.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent e) {
					XTableCell cell = (XTableCell)e.getSource();
					Window.alert(cell.getTitle());
				}
			});

		}
	}

	public String getGitPath() {
		return "/views/SimpleListController";
	}

}
