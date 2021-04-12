package chapter12.stream;

import java.util.Arrays;

public class StreamTest {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int sum = Arrays.stream(arr).sum();
        long count = Arrays.stream(arr).count();

        System.out.println(sum);
        System.out.println(count);

        System.out.println(Arrays.stream(arr).reduce(0,(a,b)->a+b));
    }
}
