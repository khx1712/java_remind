package chapter9.scheduler;

public class PriorityAllocation implements Scheduler{

    @Override
    public void getNextCall() {
        System.out.println("고객 등급순으로 가져옵니다");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("숙련도가 높은순으로 배정합니다.");
    }
}
