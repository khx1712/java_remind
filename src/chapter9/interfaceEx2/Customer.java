package chapter9.interfaceEx2;

public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("소비자 구매");
    }

    @Override
    public void order() {
        System.out.println("소비자 order");
    }

    @Override
    public void sell() {
        System.out.println("소비자 판매");
    }

    public void sayHello(){
        System.out.println("안념");
    }
}
