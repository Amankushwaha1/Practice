package DesignPatterns.Behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

public class GameCaretaker {
    List<GameMemento> mementoList = new ArrayList<>();

    public void add(GameMemento m) {
        mementoList.add(m);
    }

    public GameMemento undo() {
        if(mementoList.size()>0) {
           GameMemento m = mementoList.get(mementoList.size()-1);
           mementoList.remove(m);
            return m;
        }
        return null;
    }
}
