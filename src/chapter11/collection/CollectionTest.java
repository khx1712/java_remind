package chapter11.collection;

import java.util.LinkedList;

public class CollectionTest {
    public static void main(String[] args){
        LinkedList<Member> members = new LinkedList<>();
        LinkedList<String> strings = new LinkedList<>();

        strings.add("A");
        strings.add("B");

        for(int i =0 ; i< strings.size(); i++){
            String temp = strings.get(i);
            System.out.println(temp);
        }
    }
}
