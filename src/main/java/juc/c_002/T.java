package juc.c_002;

/**
 * synchronized关键字
 * 对某个对象加锁
 * @author Pang Xiaowei
 * @title T
 * @projectName JUC
 * @description TODO
 * @date 2019-11-0816:29
 */
public class T {
    private int count = 10;

    public void m() {
        // 任何线程要执行下面的代码，必须先获得this的锁
        synchronized (this) {
            count--;
            System.out.println(Thread.currentThread().getName() + " count is " + count);
        }
    }
}
