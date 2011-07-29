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

import next.i.controller.XTableController;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public abstract class GitXTableController extends XTableController {

	public GitXTableController() {

		getNavigationBar().setRightTitle("Source");
		getNavigationBar().getRightButton().addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				DemoUtils.openGit(getGitPath());
			}
		});
	}

	public abstract String getGitPath();

}
