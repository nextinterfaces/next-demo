package next.interfaces.rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface HelloServiceAsync {
	void sayHello(String input, AsyncCallback<String> callback) throws IllegalArgumentException;
}
