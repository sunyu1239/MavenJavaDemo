package day0528;

import java.util.ArrayList;
import java.util.List;

public class DemoT {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<Integer> list2 = new ArrayList<Integer>();
        Class c1 = list1.getClass();
        Class c2 = list2.getClass();
        System.out.println(c1 + ":" + c2);
    }
}
