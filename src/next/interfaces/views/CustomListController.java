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

import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.IsWidget;

public class CustomListController extends GitXController {

	public CustomListController() {
		setTitle("Custom Lists");
	}

	@Override
	public IsWidget getViewContent() {

		XTableView tableView = new XTableView();
		// for (int i = 0; i < 5; i++) {
		// HTML html = new HTML("hello " + i);
		// XTableCell cell = new XTableCell(html);
		// tableView.addItem(cell);
		// cell.showChevron(true);
		// // cell.addClickHandler(new ClickHandler() {
		// // public void onClick(ClickEvent event) {
		// // Window.alert("I was clicked.");
		// // }
		// // });
		// }

		Image img = new Image("images/next-icon.png");
		XTableCell cell = new XTableCell(img, "title", "accessory");
		cell.showChevron(true);
		tableView.addItem(cell);

		return tableView;
	}

	public String getGitPath() {
		return "/views/CustomListController";
	}

}
