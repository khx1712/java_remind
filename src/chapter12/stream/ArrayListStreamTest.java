package chapter12.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args){
        List<String> arr = new ArrayList<>();
        arr.add("123");
        arr.add("456");
        arr.add("789");

        Stream<String> stream = arr.stream();
        stream.forEach(s-> System.out.println(s+" "));

        arr.parallelStream().sorted().forEach(s-> System.out.println(s+" "));
        arr.stream().map(s->s.length()).forEach(n->System.out.println(n + " "));
    }
}
