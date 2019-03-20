package day0318;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * constructor
 * @author sunyu
 *
 */
public class ConstructorDemo {
    public static void main(String args[]) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class personClass=Person.class;
        //获取所有public的构造
        Constructor<Person>[] cons=personClass.getConstructors();
        for(Constructor<Person> p:cons) {
            System.out.print(p.getParameterCount()+",");
        }
        System.out.println();
        //获取所有构造
        Constructor<Person>[] consAll= personClass.getDeclaredConstructors();
        for(Constructor<Person> p:consAll) {
            System.out.print(p.getParameterCount()+",");
        }
        System.out.println();
        //获取指定public的构造
        Constructor<Person> conNull=personClass.getConstructor(null);
        System.out.println(conNull.getParameterCount());
        
        Constructor<Person> con1=personClass.getConstructor(int.class);
        System.out.println(con1.getParameterCount());
        
        //获取指定任意类型的构造
        Constructor<Person> con2=personClass.getDeclaredConstructor(String.class,String.class);
        System.out.println(con2.getParameterCount());
        con2.setAccessible(true);
        Person p=con2.newInstance("sunyu","female");
        System.out.println(p);
    }
}
