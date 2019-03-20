package day0319.reflectCommon;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TDemo {
    public static void main(String[] args) {
        List<Person> list=new ArrayList<Person>();
        list.add(new Person("sunyu","female",25));
        Class listClass=list.getClass();
        listClass.isArray();
        String t=listClass.getTypeName();

    }
}
