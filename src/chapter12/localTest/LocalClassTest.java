package chapter12.localTest;

class Outer{

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(final int i){
        final int num = 100;
        class MyRunnable implements Runnable{

            @Override
            public void run() {
                System.out.println(num);
                System.out.println(outNum);
                System.out.println(Outer.sNum);
            }
        }

        return new MyRunnable();
    }
}

public class LocalClassTest {

    public static void main(String[] args){
        Outer outer = new Outer();
        Runnable runnable = outer.getRunnable(100);

        runnable.run();
    }
}
