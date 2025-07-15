package DesignPatterns.Behavioral.Interpreter;

import java.util.HashMap;

public class IContext {
    private HashMap<String,Integer> variables = new HashMap<>();

    public void put(String name, int value) {
        variables.put(name,value);
    }
    public int get(String name){
        return variables.get(name);
    }
}
