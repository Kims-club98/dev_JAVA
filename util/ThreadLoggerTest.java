package util;

import static util.CustomLogger.logger;

class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+": run()");
    }
}
public class ThreadLoggerTest {
    public static void main(String[] args) {
        logger("thread start");
        System.out.println(Thread.currentThread().getName()+": main() start");
        logger("main() start"+Thread.currentThread().getName());
        logger(333);
        MyThread tl = new MyThread();
        System.out.println(Thread.currentThread().getName()+": start() 호출 전");
        tl.start();
        System.out.println(Thread.currentThread().getName()+": start() 호출 후");
        System.out.println(Thread.currentThread().getName()+": main() end");
    }// end of main


}// end of ThreadLoggerTest

