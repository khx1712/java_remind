package chapter15.thread;

class MyThread implements Runnable{

    @Override
    public void run(){
        int i=0;
        for(i=0; i< 10; i++){
            System.out.print(i + "\t");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {

        System.out.println("start");
//        MyThread th1 = new MyThread();
//        MyThread th2 = new MyThread();
//
//        th1.start();
//        th2.start();

//        MyThread runner1 = new MyThread();
//        Thread th1 = new Thread(runner1);
//        MyThread runner2 = new MyThread();
//        Thread th2 = new Thread(runner2);
//
//        th1.start();
//        th2.start();

        Thread t  = Thread.currentThread();
        System.out.println(t);

        System.out.println("end");

    }
}
