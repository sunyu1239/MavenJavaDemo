package day0321;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MethodProxy extends Proxy {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4363780294362553686L;

	
	protected MethodProxy(InvocationHandler h) {
		super(h);
		// TODO Auto-generated constructor stub
	}

}
