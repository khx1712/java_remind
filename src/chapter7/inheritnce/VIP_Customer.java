package chapter7.inheritnce;

public class VIP_Customer extends Customer{

    private int agentId;
    double salesRatio;

    public VIP_Customer(){
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    public VIP_Customer(int customerID, String customerName){
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }
}
