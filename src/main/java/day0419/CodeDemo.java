package day0419;

public class CodeDemo {
    public static void main(String[] args) {
        CodeA c = new CodeA();
        c.say();
        c.say();
        CodeA b = new CodeA();
        b.say();
    }
}

class CodeA {
    {
        System.out.println("CodeA");
    }
    static {
        System.out.println(" static Code");
    }

    public CodeA() {
        System.out.println("constructor");
    }

    {
        System.out.println("CodeB");
    }

    void say() {
        System.out.println("say hello");
    }
}