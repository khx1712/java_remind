package chapter8.abstractex;

public abstract class Computer {

    public abstract void display();
    public abstract void typing();

    public void turnOn(){
        System.out.println("켬");
    }
    public void turnOff(){
        System.out.println("끔");
    }
}
