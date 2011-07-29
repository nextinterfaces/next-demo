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
package next.interfaces.controller;

import next.i.controller.XController;

import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.IsWidget;

public class DemoWidgetsController extends XController {

	private String imgPath;

	public DemoWidgetsController(String title, String imgPath) {
		setTitle(title);
		this.imgPath = imgPath;
	}

	@Override
	public IsWidget getViewContent() {
		FlexTable panel = new FlexTable();
		panel.setSize("100%", "100%");
		panel.setStyleName("sample");
		panel.setWidget(0, 0, new Image(this.imgPath));
		FlexCellFormatter fcf = panel.getFlexCellFormatter();
		fcf.setVerticalAlignment(0, 0, HasVerticalAlignment.ALIGN_MIDDLE);
		fcf.setHorizontalAlignment(0, 0, HasHorizontalAlignment.ALIGN_CENTER);
		return panel;
	}

}
