package chapter12.localTest;


class Outer2{

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(final int i){
        final int num = 100;
        return new Runnable(){
            @Override
            public void run() {
                System.out.println(num);
                System.out.println(outNum);
                System.out.println(Outer.sNum);
            }
        };
    }
}


public class AnonymousInnerClass {
    public static void main(String[] args){
        Outer2 outer = new Outer2();
        Runnable runnable = outer.getRunnable(100);

        runnable.run();
    }
}
