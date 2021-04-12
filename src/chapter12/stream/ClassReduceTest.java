package chapter12.stream;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{
    @Override
    public String apply(String s1, String s2) {
        if(s1.getBytes().length > s2.getBytes().length){
            return s1;
        }else{
            return s2;
        }
    }
}

public class ClassReduceTest {
    public static void main(String[] args){
        String[] arr = {"안", "녕하", "세요!!"};
        System.out.println(Arrays.stream(arr).reduce("", (s1, s2) -> {
            if(s1.getBytes().length > s2.getBytes().length){
                return s1;
            }else{
                return s2;
            }
        }));

        System.out.println(Arrays.stream(arr).reduce(new CompareString()).get());
    }

}
