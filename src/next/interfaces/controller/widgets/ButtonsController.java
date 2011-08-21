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

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class ButtonsController extends GitXController {

	public ButtonsController() {
		setTitle("Buttons");

		RootLayoutPanel.get().getElement().addClassName("rootLayoutPanel222");
	}

	@Override
	public IsWidget getViewContent() {

		CellData d0 = new CellData(null, "Rounded", new XButton("Rounded"));
		CellData d1 = new CellData(null, "Shadow", new XButton("Shadow", XButtonType.Shadow));
		CellData d2 = new CellData(null, "Navigation", new XButton("Navigation", XButtonType.Navigation));
		CellData d3 = new CellData(null, "Blue", new XButton("Blue", XButtonType.NavigationBlue));
		CellData d4 = new CellData(null, "Red", new XButton("Red", XButtonType.NavigationRed));
		CellData d5 = new CellData(null, "Black", new XButton("Black", XButtonType.NavigationBlack));
		CellData d6 = new CellData(null, "Image", new XButton("Left", XButtonType.Image));
		CellData d7 = new CellData(null, "Image", new XButton("Right", XButtonType.Image, false));

		XTableView tableView = new XTableView();
		tableView.addItem(new XTableCell(d0), new XTableCell(d1), new XTableCell(d2), new XTableCell(d3),
				new XTableCell(d4), new XTableCell(d5), new XTableCell(d6), new XTableCell(d7));

		addClickHandlers(d0, d1, d2, d3, d4, d5, d6, d7);

		return tableView;
	}

	private void addClickHandlers(CellData... data) {
		for (CellData c : data) {
			final XButton b = (XButton) c.getEastWidgets()[0];
			b.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
					Window.alert("You tapped " + b.getTitle() + ".");
					// XPopup popup = new XPopup();
					// popup.setWidget(new XLabel("You tapped " + b.getTitle() + "."));
					// popup.setTop(30.0, Unit.PCT); popup.setRight(30.,Unit.PCT);
					// popup.setBottom(30., Unit.PCT); popup.setLeft(30., Unit.PCT);
					// popup.show();
				}
			});
		}
	}

	public String getGitPath() {
		return "/controller/widgets/ButtonsController";
	}

}
