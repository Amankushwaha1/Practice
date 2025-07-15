package DesignPatterns.Behavioral.Memento;

public class GameOriginator {
        int level;
        String gamemode;

        public void displayGame() {
            System.out.println("Level: " + level + " || Game Mode: " + gamemode);
        }

        public GameOriginator(int level, String gamemode) {
            this.level = level;
            this.gamemode = gamemode;
        }

        public void setlevel(int level) {
            this.level = level;
        }

        public void setGamemode(String gamemode) {
            this.gamemode = gamemode;
        }

        public GameMemento creatememento() {
            return (new GameMemento(this.level,this.gamemode));
        }

        public void restorememento(GameMemento m) {
            this.level = m.getlevel();
            this.gamemode = m.getGamemode();
        }
    }
