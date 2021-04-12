package chapter15.synchronize;

class Bank{
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    private int money = 10000;

    public synchronized void saveMoney(int money){
        synchronized (this) {
            int m = this.getMoney();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setMoney(m + money);
        }
    }

    public synchronized void minusMoney(int money){
        synchronized (this) {
            int m = this.getMoney();

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setMoney(m - money);
        }
    }
}

class ClientPark extends Thread{
    public void run(){
        synchronized (SyncTest.myBank) {
            System.out.println("start save!");
            SyncTest.myBank.saveMoney(3000);
            System.out.println("잔고 : " + SyncTest.myBank.getMoney());
            System.out.println("end save!");
        }
    }
}

class ClientLee extends Thread{
    public void run(){
        synchronized (SyncTest.myBank) {
            System.out.println("start minus!");
            SyncTest.myBank.minusMoney(1000);
            System.out.println("잔고 : " + SyncTest.myBank.getMoney());
            System.out.println("end minus!");
        }
    }
}

public class SyncTest {

    public static Bank myBank = new Bank();

    public static void main(String[] args) throws InterruptedException {
        ClientPark clientPark = new ClientPark();
        clientPark.start();
        Thread.sleep(200);

        ClientLee clientLee = new ClientLee();
        clientLee.start();
    }
}
