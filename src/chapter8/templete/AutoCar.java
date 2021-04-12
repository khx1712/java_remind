package chapter8.templete;

public class AutoCar extends Car{
    @Override
    public void drive() {
        System.out.println("사람이 운전");
    }

    @Override
    public void stop() {
        System.out.println("사람이 멈춤");
    }
}
