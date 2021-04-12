package chapter8.Game;

public class SuperLevel extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("개빨리 달림");
    }

    @Override
    public void jump() {
        System.out.println("개높게 점프함");
    }

    @Override
    public void turn() {
        System.out.println("회전 개빠름");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("**고급자임**");
    }
}
