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

import next.i.view.Slide;
import next.i.view.XNavigationBar;
import next.i.view.XSlideView;
import next.i.view.XBarItem.Type;
import next.interfaces.controller.GitXController;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.VerticalPanel;

public class SlideController extends GitXController {

	public SlideController() {
		setTitle("Slide Bar");
	}

	@Override
	public IsWidget getViewContent() {

		XSlideView slidePanel = new XSlideView();
		Slide s0 = new Slide();
		Slide s1 = new Slide();
		for (int i = 0; i < 10; i++) {
			s0.add(new HTML(i + " aaaaaaa aaaaaaaaaa aaaaaaaaaaa"));
			s1.add(new HTML(i + " bb xx zz"));
		}
		slidePanel.add(s0);
		slidePanel.add(s1);
		
//		VerticalPanel vp = new VerticalPanel();
//		vp.setWidth("100%");
//
//		XNavigationBar bar1 = new XNavigationBar();
//		bar1.setTitle("Slide me 1");
//		vp.add(bar1);
//
//		XNavigationBar bar2 = new XNavigationBar();
//		bar2.setLeftTitle("Back", Type.BACK_BUTTON);
//		bar2.setTitle("Slide me 2");
//		vp.add(bar2);

		return slidePanel;
		// XNavigationView navigationView = new XNavigationView();
		// navigationView.setNavigationBar(bar);
		// HTML tbl = new HTML("I am a Navigation view content.");
		// tbl.setSize("100%", "100%");
		// Style style = tbl.getElement().getStyle();
		// style.setBackgroundColor("#fefefe");
		// style.setProperty("textAlign", "center");
		// style.setProperty("paddingTop", "50px");
		// navigationView.setNavigationContent(tbl);
		//
		// return navigationView;
	}

	public String getGitPath() {
		return "/views/NavigationBarController";
	}

}
