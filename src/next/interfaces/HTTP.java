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
package next.interfaces;

import next.i.XLog;

import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.URL;

public class HTTP {

	public static void doGet(String url, ResponseReader responseReader) {

		RequestBuilder builder = new RequestBuilder(RequestBuilder.GET, URL.encode(url));

		try {
			builder.sendRequest(null, new Callback_(responseReader));
		} catch (RequestException e) {
			XLog.err("RequestException: " + e.getMessage());
			responseReader.onError(null, e);
		}
	}
	

	private static class Callback_ implements RequestCallback {
		ResponseReader reader;

		public Callback_(ResponseReader reader) {
			this.reader = reader;
		}

		public void onError(Request request, Throwable e) {
			reader.onError(null, e);
		}

		public void onResponseReceived(Request request, Response response) {
			if (200 == response.getStatusCode()) {
				reader.onSuccess(response);
			} else {
				// XLog.warn("RequestCallback::onResponseReceived, not supported status '"
				// + response.getStatusCode() + "'");
				reader.onError(response, null);
			}
		}
	}


}
