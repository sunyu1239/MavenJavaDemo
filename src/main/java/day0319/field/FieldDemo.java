package day0319.field;

import java.lang.reflect.Field;

/**
 * field
 * @author sunyu
 *
 */
public class FieldDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        Class personClass=Class.forName("day0319.field.Person");
        
        //获取所有public属性
        Field[] fields = personClass.getFields();
        for(Field f:fields) {
            System.out.print(f.getModifiers()+",");
        }
        System.out.println();
        //获取所有属性
        Field[] fieldAll=personClass.getDeclaredFields();
        for(Field f:fieldAll) {
            System.out.print(f.getModifiers()+",");
        }
        System.out.println();
        //获取指定public属性
        Field fp=personClass.getField("father");
        Person p=new Person();
        fp.set(p, "hha");
        System.out.println(p.father);
        System.out.println(fp);
        //获取指定任意属性
        Field f=personClass.getDeclaredField("name");
        f.setAccessible(true);
        System.out.println(f);
        Person p1=new Person();
        f.set(p1, "sunyu");
        System.out.println(f.get(p1));
    }
}
