package chapter9.interfaceEx2;

public interface Buy {

    void buy();

    default void order(){
        System.out.println("구매중");
    }
}
