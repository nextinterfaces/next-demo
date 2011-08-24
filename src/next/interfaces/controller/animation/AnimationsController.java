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

import next.i.util.Utils;
import next.i.view.CellData;
import next.i.view.TableData;
import next.i.view.XTableCell;
import next.i.view.XTableView;
import next.interfaces.controller.GitXTableController;

public class AnimationsController extends GitXTableController {

	private SlideController slideCtrl;

	public AnimationsController() {

		setTitle("Animations");

		((XTableView) getView()).showChevron(true);

		TableData tableDS = new TableData();

		tableDS.add("Slide", "Slide up", "Slide down", "Fade", "Pop", "Swap", "Flip", "Horizontal Scroll");

		initDataSource(tableDS);
	}

	@Override
	public void onRowSelected(int indexSelected, CellData cellDataSelected, XTableCell tableCell) {

		if (indexSelected == 0) {
			if (slideCtrl == null) {
				slideCtrl = new SlideController();
			}
			getNavigationController().pushController(slideCtrl, true);

		} else if (indexSelected == 1) {
			SlideUpDownController ctrl = new SlideUpDownController("Slide Up", true);
			ctrl.slideUpIn();

		} else if (indexSelected == 2) {
			SlideUpDownController ctrl = new SlideUpDownController("Slide Down", false);
			ctrl.slideDownIn();

		} else if (indexSelected == 3) {
			FadeController ctrl = new FadeController();
			ctrl.fadeIn();

		} else if (indexSelected == 4) {
			PopController ctrl = new PopController();
			ctrl.popIn();

		} else if (indexSelected == 5) {
			SwapController ctrl = new SwapController(getNavigationController().getVisibleController());
			this.swapTo(ctrl, null);

		} else if (indexSelected == 6) {
			if (!Utils.isAndroid()) { // disable android as it rotates wrong
				FlipController ctrl = new FlipController(getNavigationController().getVisibleController());
				this.flipTo(ctrl, null);
			}

		} else if (indexSelected == 7) {
			HorizontalController ctrl = new HorizontalController();
			getNavigationController().pushController(ctrl, true);
		}

	}

	public String getGitPath() {
		return "/controller/animation/AnimationsController";
	}

}
