package chapter14.decoratorPattern;

public class KenyaAmericano extends Coffee{
    @Override
    public void brewing() {
        System.out.print("KenyaAmericano ");
    }
}
