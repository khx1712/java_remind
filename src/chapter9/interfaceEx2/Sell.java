package chapter9.interfaceEx2;

public interface Sell {

    void sell();

    default void order(){
        System.out.println("판매중");
    }
}
