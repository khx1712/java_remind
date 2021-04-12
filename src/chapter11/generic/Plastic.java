package chapter11.generic;

public class Plastic extends Material {

    public String toString(){
        return "플라스틱";
    }

    @Override
    public void doPrinting() {
        System.out.println("플라스틱 프린팅");
    }
}
