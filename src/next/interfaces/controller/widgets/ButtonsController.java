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
import next.i.view.widgets.XButton;
import next.i.view.widgets.XButton.XButtonType;
import next.interfaces.controller.GitXController;

import com.google.gwt.user.client.ui.IsWidget;

public class ButtonsController extends GitXController {

	public ButtonsController() {
		setTitle("Buttons");
	}

	@Override
	public IsWidget getViewContent() {

		CellData d0 = new CellData(null, "Rounded Default", new XButton("Done"));
		XTableCell c0 = new XTableCell(d0);

		CellData d1 = new CellData(null, "Navigation", new XButton("Done", XButtonType.Navigation));
		XTableCell c1 = new XTableCell(d1);

		CellData d2 = new CellData(null, "Shadow", new XButton("Done", XButtonType.Shadow));
		XTableCell c2 = new XTableCell(d2);

		CellData d3 = new CellData(null, "Add", new XButton("Item", XButtonType.Add));
		XTableCell c3 = new XTableCell(d3);

		CellData d4 = new CellData(null, "Disclosure", new XButton("Preview", XButtonType.Disclosure, false));
		XTableCell c4 = new XTableCell(d4);

		XTableView tableView = new XTableView();
		tableView.addItem(c0, c1, c2, c3, c4);

		return tableView;
	}

	public String getGitPath() {
		return "/controller/widgets/ButtonsController";
	}

}
