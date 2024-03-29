package juc.c_003;

/**
 * synchronized关键字
 * 对某个对象加锁
 * @author Pang Xiaowei
 * @title T
 * @projectName JUC
 * @description TODO
 * @date 2019-11-0816:33
 */
public class T {
    private int count = 10;

    /**
     * 等同于在方法的代码执行时要synchronized(this)
     */
    public synchronized void m() {
        count--;
        System.out.println(Thread.currentThread().getName() + " count is " + count);
    }

}
