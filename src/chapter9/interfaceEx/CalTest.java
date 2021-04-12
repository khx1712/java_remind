package chapter9.interfaceEx;

public class CalTest {
    public static void main(String[] args){
        Calc completeCalc = new CompleteCalc();

        int n1 = 10;
        int n2 = 2;

        System.out.println(completeCalc.div(n1, n2));

        completeCalc.description();

        int[] arr = {1,2,3,4,5};

        int sum = Calc.total(arr);
    }
}
