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

import next.i.controller.XTableController;
import next.i.view.XTableCell;
import next.i.view.CellData;
import next.i.view.TableData;
import next.i.view.XTableView;
import next.interfaces.controller.DemoUtils;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class ListsController extends XTableController {

	public ListsController() {

		setTitle("Lists and Tabs");

		getNavigationBar().setRightTitle("Source");
		getNavigationBar().getRightButton().addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				DemoUtils.openGit(getGitPath());
			}
		});

		((XTableView) getView()).showChevron(true);

		TableData tableDS = new TableData();
		tableDS.add("List", "Navigation Bar", "Custom List", "Slide panels");

		initDataSource(tableDS);
	}

	@Override
	public void onRowSelected(int indexSelected, CellData cellDataSelected, XTableCell tableCell) {

		if (indexSelected == 0) {
			getNavigationController().pushController(new SimpleListController(), true);

		} else if (indexSelected == 1) {
			getNavigationController().pushController(new NavigationBarController(), true);

		} else if (indexSelected == 2) {
			getNavigationController().pushController(new CustomListController(), true);

		} else if (indexSelected == 3) {
			getNavigationController().pushController(new SlideController(), true);

		}
	}

	public String getGitPath() {
		return "/views/ListsController";
	}

}
