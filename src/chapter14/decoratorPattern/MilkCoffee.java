package chapter14.decoratorPattern;

public class MilkCoffee extends Decorator{
    public MilkCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing(){
        super.brewing();
        System.out.print("Adding Milk ");
    }
}
