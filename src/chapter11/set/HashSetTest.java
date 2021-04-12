package chapter11.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    public static  void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("오승찬");
        set.add("김민지");
        set.add("이상엽");
        set.add("오승찬");

        System.out.println(set);

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
