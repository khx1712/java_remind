package chapter8.Game;

public class BeginnerLevel extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("천천히 달림");
    }

    @Override
    public void jump() {
        System.out.println("점프 못함");
    }

    @Override
    public void turn() {
        System.out.println("회전못함");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("**초급자임**");
    }
}
