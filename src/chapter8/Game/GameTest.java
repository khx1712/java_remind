package chapter8.Game;

public class GameTest {
    public static void main(String[] args){
        Player player1 = new Player();
        player1.play(1);

        AdvencedLevel advencedLevel = new AdvencedLevel();
        player1.upgradeLevel(advencedLevel);
        player1.play(10);
    }
}
