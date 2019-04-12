package day0412;

public class StringDemo {
    // final int a;

    // StringDemo() {
    // this.a = 10;
    // }

    public static void main(String[] args) {
        // StringDemo ss = new StringDemo();
        // ss.a = 10;
        Student as = new Student();
        as.a = 20;
        as.st();
        String name = "sunyu";
        StringBuilder na;
        StringBuffer ha;
    }
}

class Student {
    int a;

    void st() {
        System.out.println(a);
    }
}