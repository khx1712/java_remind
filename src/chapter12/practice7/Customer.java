package chapter12.practice7;

public class Customer {
    static private int serialId = 1;
    private int customerId;
    private String customerName;
    private int age;
    private int cost;

    public Customer(String customerName, int age, int cost) {
        this.customerId = serialId;
        serialId++;
        this.customerName = customerName;
        this.age = age;
        this.cost = cost;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", age=" + age +
                ", cost=" + cost +
                '}';
    }
}
