package juc.c_001;

/**
 * synchronized关键字
 * 对某个对象加锁
 * @author Pang Xiaowei
 * @title T
 * @projectName JUC
 * @description TODO
 * @date 2019-11-0816:19
 */
public class T {
    private int count = 10;
    private Object o = new Object();

    public void m() {
        // 任何线程要执行下面的代码，必须先获得o的锁
        synchronized (o) {
            count--;
            System.out.println(Thread.currentThread().getName() + "count = " + count);
        }
    }

    public static void main(String[] args) {

    }


}
