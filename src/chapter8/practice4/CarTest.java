package chapter8.practice4;

import java.util.ArrayList;

public class CarTest {
    public static void main(String[] args){
        ArrayList<Car> carArrayList= new ArrayList<>();
        carArrayList.add(new Sonata());
        carArrayList.add(new Genesis());
        carArrayList.add(new Avente());
        carArrayList.add(new Grandeur());

        for(Car car : carArrayList){
            car.run();
            System.out.println("-------");
        }
    }
}
