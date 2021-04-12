package chapter12.lambda;

interface PrintString{
    void showString(String str);
}

public class TestLambda {
    public static void main(String[] args){
        PrintString lambdaStr = s->System.out.println(s);
        lambdaStr.showString("Test");
    }
}
