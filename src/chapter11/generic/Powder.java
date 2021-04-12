package chapter11.generic;

public class Powder extends Material{

    public String toString(){
        return "파우더";
    }

    @Override
    public void doPrinting() {
        System.out.println("파우더 프린팅");
    }
}
