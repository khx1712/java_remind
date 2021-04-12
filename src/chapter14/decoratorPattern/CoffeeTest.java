package chapter14.decoratorPattern;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee americano = new KenyaAmericano();
        americano.brewing();
        System.out.println();

        Coffee americanoMilkCoffee = new MilkCoffee(new KenyaAmericano());
        americanoMilkCoffee.brewing();
        System.out.println();

        Coffee kenyaMocha = new Mocha(new MilkCoffee(new KenyaAmericano()));
        kenyaMocha.brewing();
        System.out.println();

        Coffee ethiopiaMocha = new Mocha(new MilkCoffee(new EthiopiaAmericano()));
        ethiopiaMocha.brewing();
    }
}
