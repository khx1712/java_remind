package chapter9.scheduler;

public class RoundRobin implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("상담 순서대로 가져옴");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("다음 상감원에게 연결");
    }
}
