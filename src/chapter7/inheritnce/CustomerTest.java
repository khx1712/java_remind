package chapter7.inheritnce;

public class CustomerTest {
    public static void main(String[] args){
        /*
        Customer customer1 = new Customer();
        customer1.setCustomerName("이순신");
        customer1.setCustomerID(10010);
        customer1.bonusPoint = 10000;
        */

        VIP_Customer customer2 = new VIP_Customer();
        customer2.setCustomerName("김유신");
        customer2.setCustomerID(10020);
        customer2.bonusPoint = 10000;

        customer2.printCustomerInfo();
    }
}
