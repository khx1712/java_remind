package chapter7.polymophism;

public class Gold_Customer extends Customer{

    double salesRatio;

    public Gold_Customer(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "GOLD";
        bonusRatio = 0.02;
        this.salesRatio = 0.1;
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }
}
