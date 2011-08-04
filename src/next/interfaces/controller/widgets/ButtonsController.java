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

import next.i.view.XTableCell;
import next.i.view.XTableCellData;
import next.i.view.XTableView;
import next.i.view.widgets.XButton;
import next.i.view.widgets.XButton.XButtonType;
import next.interfaces.controller.GitXController;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;

public class ButtonsController extends GitXController {

	public ButtonsController() {
		setTitle("Buttons");
	}

	@Override
	public IsWidget getViewContent() {

		XTableCellData d0 = new XTableCellData();
		d0.setTextWidgets(new Label("Rounded Default"));
		d0.setEastWidgets(new XButton("Done"));
		XTableCell c0 = new XTableCell(d0);

		XTableCellData d1 = new XTableCellData();
		d1.setTextWidgets(new Label("Navigation"));
		d1.setEastWidgets(new XButton("Done", XButtonType.Navigation));
		XTableCell c1 = new XTableCell(d1);

		XTableCellData d2 = new XTableCellData();
		d2.setTextWidgets(new Label("Shadow"));
		d2.setEastWidgets(new XButton("Done", XButtonType.Shadow));
		XTableCell c2 = new XTableCell(d2);

		XTableCellData d3 = new XTableCellData();
		d3.setTextWidgets(new Label("Add"));
		d3.setEastWidgets(new XButton("Item", XButtonType.Add));
		XTableCell c3 = new XTableCell(d3);

		XTableCellData d4 = new XTableCellData();
		d4.setTextWidgets(new Label("Disclosure"));
		d4.setEastWidgets(new XButton("Preview", XButtonType.Disclosure, false));
		XTableCell c4 = new XTableCell(d4);

		XTableView tableView = new XTableView();
		tableView.addItem(c0, c1, c2, c3, c4);
		
		return tableView;
	}

	public String getGitPath() {
		return "/controller/widgets/ButtonsController";
	}

}
