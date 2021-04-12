package chapter7.polymophism;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.ArrayList;

class Animal{
    public void move(){
        System.out.println("동물이 움직입니다.");
    }

}

class Human extends Animal{
    public void move(){
        System.out.println("사람이 두발로 걷습니다.");
    }

    public void readBook(){
        System.out.println("사림이 책을 읽습니다");
    }
}

class Tiger extends Animal{
    public void move(){
        System.out.println("호랑이가 네발로 뜁니다.");
    }

    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다");
    }
}

class Eagle extends Animal{
    public void move(){
        System.out.println("독수리가 하늘을 날아갑니다.");
    }

    public void flying(){
        System.out.println("독수리가 날아갑니다.");
    }
}

public class AnimalTest {

    public static  void main(String [] args){
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        AnimalTest test = new AnimalTest();
        test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);

        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(hAnimal);
        animalArrayList.add(tAnimal);
        animalArrayList.add(eAnimal);

        for(Animal animal : animalArrayList){
            animal.move();
        }

    }

    public void testDownCasting(ArrayList<Animal> list){
        for(Animal animal : list){
            if(animal instanceof Human){
                Human human = (Human) animal;
                human.readBook();
            }else if(animal instanceof Tiger){
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            }else if(animal instanceof Eagle){
                Eagle eagle = (Eagle) animal;
                eagle.flying();
            }
        }
    }

    public void moveAnimal(Animal animal){
        animal.move();
    }
}
