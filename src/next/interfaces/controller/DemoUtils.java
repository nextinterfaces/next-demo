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

import next.i.util.Utils;
import next.i.view.CellData;
import next.interfaces.Globals;

public class DemoUtils {

	public static CellData[] DATA;

	static {
		DATA = populate();
	}

	private static CellData[] populate() {

		String[] names = { "Argentina", "Bolivia", "Brazil", "Chile", "Colombia", "Costa Rica", "Cuba",
				"Dominican Republic", "Ecuador", "El Salvador", "Guatemala", "Honduras", "Mexico", "Nicaragua", "Panama",
				"Paraguay", "Peru", "Puerto Rico", "Uruguay", "Venezuela" };

		int len = names.length;
		CellData[] arr = new CellData[len];
		for (int i = 0; i < len; i++) {
			arr[i] = new CellData(names[i]);
		}

		return arr;
	}

	public static native void openURL(String url)/*-{
		$wnd.open(url, 'target=_blank');
	}-*/;

	public static void openGit(String url) {
		Utils.loadUrl(Globals.GIT_HOST + url + ".java");
		// openURL(Globals.GIT_HOST + url + ".java");
	};

}
