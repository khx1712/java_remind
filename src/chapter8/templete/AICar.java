package chapter8.templete;

import chapter8.templete.Car;

public class AICar extends Car {

    @Override
    public void drive() {
        System.out.println("자율주행");
    }

    @Override
    public void stop() {
        System.out.println("스스로 멈춤");
    }

    @Override
    public void washCar() {
        System.out.println("자율 세차함");
    }
}
