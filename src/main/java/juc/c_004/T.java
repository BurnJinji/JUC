package juc.c_004;

/**
 * synchronized关键字
 * 对某个对象加锁
 * @author Pang Xiaowei
 * @title T
 * @projectName JUC
 * @description TODO
 * @date 2019-11-0908:25
 */
public class T {
    private static int count = 10;


    public synchronized static void m() {
        // 这里等同于synchronized(T.class)
        count--;
        System.out.println(Thread.currentThread().getName() + " count is " + count);
    }

    public static void mm() {
        synchronized (T.class) {
            count--;
        }
    }

}
