package chapter7.inheritnce;

public class OverridingTest {

    public static void main(String[] args){
        Customer customer1 = new Customer(10010, "이순신");
        customer1.bonusPoint = 10000;

        VIP_Customer customer2 = new VIP_Customer(10020, "김유신");
        customer2.bonusPoint = 10000;

        int price1 = customer1.calcPrice(10000);
        int price2 = customer2.calcPrice(10000);

        System.out.println(price1 + ", " + price2);

        customer1.printCustomerInfo();
        customer2.printCustomerInfo();

        Customer customer3 = new VIP_Customer(10030, "김민지");
        customer3.bonusPoint = 10000;
        int price3 = customer3.calcPrice(100000);

        customer3.printCustomerInfo();
        System.out.println(price3);
    }
}
