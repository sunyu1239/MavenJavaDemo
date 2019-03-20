package day0320.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonHandler implements InvocationHandler {
    private Object obj;
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before");
		Object invkoe=method.invoke(obj, args);
		System.out.println("after");
		return invkoe;
	}
	public PersonHandler(Object obj) {
		super();
		this.obj = obj;
	}

}
