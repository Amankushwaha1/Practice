package DesignPatterns.Behavioral.Memento;

public class GameMemento {
    int level;
    String gamemode;

    public GameMemento(int level, String gamemode) {
        this.level = level;
        this.gamemode = gamemode;
    }
    public int getlevel() {
        return level;
    }
    public String getGamemode() {
        return gamemode;
    }
}
