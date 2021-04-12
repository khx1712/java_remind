package chapter9.interfaceEx;

public interface Calc {
    public static double PI = 3.14;
    int ERROR = -99999999;

    int add(int num1, int num2);
    int sub(int num1, int num2);
    int times(int num1, int num2);
    int div(int num1, int num2);

    default void description(){
        System.out.println("점수 계산기 구현");
        myMethod();
    }

    static int total(int[] arr){
        int total = 0;

        for(int i : arr) {
            total += i;
        }
        return total;
    }

    private void myMethod(){
         System.out.println("private method");
    }
}
