package day0412;

public class TryDemo {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        TryDemo ss = new TryDemo();
        System.out.println(ss.vla(a, b));
    }

    int vla(int a, int b) {
        try {
            int c = a / b;
            return 30;
        } catch (Exception e) {
            System.out.println("hello error");
        } finally {
            System.out.println("hello sss");
            return 10;
        }
        // return 20;
    }
}
