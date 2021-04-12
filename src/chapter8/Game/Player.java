package chapter8.Game;

public class Player {
    private PlayerLevel playerLevel;

    public Player() {
        this.playerLevel = new BeginnerLevel();
        this.playerLevel.showLevelMessage();
    }

    public PlayerLevel getPlayerLevel(){
        return playerLevel;
    }

    public void upgradeLevel(PlayerLevel playerLevel){
        this.playerLevel = playerLevel;
        this.playerLevel.showLevelMessage();
    }

    public void play(int count){
        this.playerLevel.go(count);
    }
}
