package chapter11.collection;

import java.util.ArrayList;

class MyStack{

    private ArrayList<String> arrayList = new ArrayList<>();

    public void push(String data){
        arrayList.add(data);
    }

    public String pop(){
        if(arrayList.isEmpty()){
            System.out.println("비었음");
            return null;
        }else{
            return arrayList.remove(arrayList.size()-1);
        }
    }
}

public class StackTest {

    public static void main(String [] args){
        MyStack stack = new MyStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
