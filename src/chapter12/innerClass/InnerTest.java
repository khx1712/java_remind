package chapter12.innerClass;

class OutClass{
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass(){
        inClass = new InClass();
    }

    class InClass{
        int iNum = 100;

        void inTest(){
            System.out.println(num);
            System.out.println(sNum);
        }
    }

    public void usingInner(){
        inClass.inTest();
    }

    static class InStaticClass{
        int inNum = 100;
        static int sInNum = 200;

        void inTest(){
            System.out.println(inNum);
            System.out.println(sInNum);
        }

        static void sTest(){
            System.out.println(sInNum);
        }
    }

}

public class InnerTest {
    public static void main(String[] args){
        OutClass outClass = new OutClass();
        outClass.usingInner();

        OutClass.InClass myInClass = outClass.new InClass();
        myInClass.inTest();
    }
}
