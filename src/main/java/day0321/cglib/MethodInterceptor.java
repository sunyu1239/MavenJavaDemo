package day0321.cglib;

import java.lang.reflect.Method;

import javax.security.auth.callback.Callback;

/**
 * @param obj "this", the enhanced object
 * @param method intercepted Method
 * @param args argument array; primitive types are wrapped
 * @param proxy used to invoke super (non-intercepted method); may be called
 * @author sunyu
 *
 */
public interface MethodInterceptor extends Callback {
    public Object intercept(Object sub, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable;
}
