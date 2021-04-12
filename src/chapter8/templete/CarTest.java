package chapter8.templete;

public class CarTest {
    public static void main(String [] args){
        Car aiCar = new AICar();
        aiCar.run();
        System.out.println("------------");
        Car autoCar = new AutoCar();
        autoCar.run();



    }
}
