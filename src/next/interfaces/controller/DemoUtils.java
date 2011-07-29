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


import java.util.ArrayList;

import next.i.util.Utils;
import next.interfaces.Globals;


public class DemoUtils {

	public static String[] DATA;

	static {
		DATA = populate();
	}

	private static String[] populate() {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 31; i++) {
			list.add(i + " list item");
		}

		String[] arr = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
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
