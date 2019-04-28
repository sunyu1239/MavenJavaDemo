package day0426;

public class ThreadDemo {
    public static void main(String[] args) {
        CreateThread1 c1 = new CreateThread1();
        CreateThread2 c2 = new CreateThread2();
        Thread t1 = new Thread(c1);
        t1.start();
        c2.start();
    }
}

class CreateThread1 implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Thread1 :" + Thread.currentThread().getName());
    }

}

class CreateThread2 extends Thread {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Thread2 :" + Thread.currentThread().getName());
    }
}