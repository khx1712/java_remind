package chapter9.scheduler;

public class LeastJob implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("대기열에서 가져옴");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("LeastJob");
    }
}
