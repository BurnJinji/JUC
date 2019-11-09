package juc.c_000;

/**
 * @author Pang Xiaowei
 * @title T02_HowToCreateThread
 * @projectName JUC
 * @description TODO
 * @date 2019-11-0814:55
 */
public class T02_HowToCreateThread {
    private static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello MyThread");
        }
    }

    private static class MyRun implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello MyRun");
        }
    }

    public static void main(String[] args) {
        new MyThread().start();
        new Thread(new MyRun()).start();
        new Thread(() -> System.out.println("Hello lambda")).start();
    }

}
