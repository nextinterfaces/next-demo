package next.server;

import next.interfaces.rpc.HelloService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class HelloServiceImpl extends RemoteServiceServlet implements HelloService {

	public String sayHello(String input) throws IllegalArgumentException {
		return "Hello from RPC - " + input;
	}

}
