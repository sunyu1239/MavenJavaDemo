package day0320.proxy;

import java.lang.reflect.Proxy;

public class ProxyDemoTest {
    public static void main(String[] args) {
        Person personProxy=(Person) Proxy.newProxyInstance(ProxyDemoTest.class.getClassLoader(), new Class<?>[]{Person.class}, new PersonHandler(new Teacher()));
        personProxy.doSomeThing();
        personProxy.noSomeThing();
        System.out.println(personProxy.calCount(10));
        System.out.println(personProxy.plusCount(10));
    }
}
