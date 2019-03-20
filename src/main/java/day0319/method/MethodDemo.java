package day0319.method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * method
 * @author sunyu
 *
 */
public class MethodDemo {
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        Person p=new Person();
        Class personClass=p.getClass();
        //获取所有public权限的方法
        Method[] meths=personClass.getMethods();
        for(Method m:meths) {
            System.out.print(m.getName()+",");
        }
        System.out.println();
        //获取所有任意权限的方法
        Method[] methAll=personClass.getDeclaredMethods();
        for(Method m: methAll) {
            System.out.print(m.getName()+",");
        }
        System.out.print("\n");
        
        //获取指定public的方法
        Method mm=personClass.getMethod("getName", null);
        System.out.println(mm.getName());
        mm.invoke(p, null);
        //获取指定的方法
        Method meth=personClass.getDeclaredMethod("sayHello", int.class);
        System.out.println(meth.getName());
        meth.setAccessible(true);
        meth.invoke(p, 10);
        
    }
}
