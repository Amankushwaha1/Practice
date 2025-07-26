package DesignPatterns.Creational.ObjectPool;

public class OutOfResourceCapacityException extends Exception {
    public OutOfResourceCapacityException() {
        System.out.println("Max No of Resources Reached");
    }
}
