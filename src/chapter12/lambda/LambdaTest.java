package chapter12.lambda;

public class LambdaTest {
    public static void main(String[] args){
        MyMaxNumber max = (x, y)->(x >= y)? x:y;
        System.out.println(max.getMaxNumber(10,20));
    }
}
