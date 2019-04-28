package day0428;

public class SynchronizedDemo {
    public static void main(String[] args) {
        Synchronized s = new Synchronized();
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                s.synchronized1();

            }
        });
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                s.test();

            }
        });
        t1.start();
        t2.start();
    }
}

class Synchronized {
    synchronized void synchronized1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("synchronized1:" + i);
        }
    }

    void test() {
        System.out.println("test start");
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println("test:" + i);
            }
        }
        System.out.println("test end");
    }
}
