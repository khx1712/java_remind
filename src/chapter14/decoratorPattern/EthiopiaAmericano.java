package chapter14.decoratorPattern;

public class EthiopiaAmericano extends Coffee{
    @Override
    public void brewing() {
        System.out.print("EthiopiaAmericano ");
    }
}
