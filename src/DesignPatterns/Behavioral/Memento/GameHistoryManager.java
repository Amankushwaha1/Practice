package DesignPatterns.Behavioral.Memento;

public class GameHistoryManager {
    private static void sop(Object o){
        System.out.println(o);
    }
    public static void main(String[] args) {
        sop("Game History Manager");

        GameCaretaker caretaker = new GameCaretaker();

        GameOriginator originator = new GameOriginator(5,"MEDIUM");

        originator.displayGame();
        caretaker.add(originator.creatememento());

        originator.setlevel(6);
        originator.displayGame();
        caretaker.add(originator.creatememento());

        originator.setlevel(7);
        originator.displayGame();

        originator.restorememento(caretaker.undo());
        originator.displayGame();

        originator.setlevel(7);
        originator.setGamemode("HARD");
        originator.displayGame();
        caretaker.add(originator.creatememento());

        sop("Game History Closed");
    }
}
