package day0321.cglib;

import java.lang.reflect.Method;

public class MyMethodInterceptor implements MethodInterceptor {

	@Override
	public Object intercept(Object sub, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before");
		Object invoke=method.invoke(sub, objects);
		System.out.println("after");
		return invoke;
	}

}
