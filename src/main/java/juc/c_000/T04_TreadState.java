package juc.c_000;

/**
 * @author Pang Xiaowei
 * @title T04_TreadState
 * @projectName JUC
 * @description TODO
 * @date 2019-11-0815:54
 */
public class T04_TreadState {
    private static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getState());
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Thread t = new MyThread();
        System.out.println(t.getState());
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getState());
    }
}
