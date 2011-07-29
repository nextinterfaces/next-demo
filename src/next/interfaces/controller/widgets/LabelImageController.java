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

import next.i.view.widgets.XAnchor;
import next.i.view.widgets.XFlexTable;
import next.i.view.widgets.XImage;
import next.i.view.widgets.XLabel;
import next.i.view.widgets.XLabel.XLabelType;
import next.interfaces.controller.GitXController;

import com.google.gwt.user.client.ui.IsWidget;

public class LabelImageController extends GitXController {

	public LabelImageController() {
		setTitle("Label and Image");
	}

	@Override
	public IsWidget getViewContent() {
		XFlexTable panel = new XFlexTable("100%", null);
		panel.setCellSpacing(10);

		XLabel headline = new XLabel("Headline Title", XLabelType.Header);
		XLabel text = new XLabel("Label text: Neque porro quisquam est qui dolorem ipsum "
				+ "quia dolor sit amet, consectetur, adipisci velit...");

		XAnchor link = new XAnchor("Picture Original Link", "images/icons/earth.jpg", "_blank");
		XImage img1 = new XImage("images/icons/earth.jpg");

		panel.addWidgets(headline, text, link, img1);

		return panel;
	}

	public String getGitPath() {
		return "/controller/widgets/LabelImageController";
	}

}
