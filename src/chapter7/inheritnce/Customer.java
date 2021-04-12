package chapter7.inheritnce;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer(){
        this.customerGrade = "SILVER";
        this.bonusRatio = 0.01;

        System.out.println("customer 호출");
    }

    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerGrade = "SILVER";
        this.bonusRatio = 0.01;

        System.out.println("customer 호출");
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void printCustomerInfo(){
        System.out.println("아이디 : " + customerID + ", 이름 : " + customerName +", 보너스포인트 : " + bonusPoint );
    }
}
