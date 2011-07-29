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
package next.interfaces.controller.animation;

import next.i.controller.XController;
import next.i.view.XTableDataSource;
import next.i.view.XBarItem.Type;
import next.interfaces.controller.DemoUtils;
import next.interfaces.controller.GitXTableController;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class SwapController extends GitXTableController {

	public SwapController(final XController invokerController) {

		setTitle("Swap Example");

		getNavigationBar().setLeftTitle("Done", Type.BUTTON);
		getNavigationBar().getLeftButton().setHighlighted(true);
		getNavigationBar().getLeftButton().addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				SwapController.this.swapToReverse(invokerController, null);
			}
		});

		XTableDataSource tableDS = new XTableDataSource();
		tableDS.add(data());

		initDataSource(tableDS);
	}

	private String[] data() {
		return DemoUtils.DATA;
	}

	public String getGitPath() {
		return "/controller/animation/SwapController";
	}

}
