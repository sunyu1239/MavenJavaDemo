package day0319.reflectCommon;

import java.lang.reflect.Array;

public class Demo {
    public static void main(String[] args) {
    	String[] arr= {"mam","cvb","hehe"};
    	Class arrClass = arr.getClass();
    	Array.set(arr, 0, null);
    	arrClass.isArray();
    }
}
