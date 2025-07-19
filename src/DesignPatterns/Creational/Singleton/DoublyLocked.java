package DesignPatterns.Creational.Singleton;

public class DoublyLocked {
    private static DoublyLocked instance;
    private DoublyLocked() {

    }

    //Other Thread waits only if not instantiate.
    //Once object created no wait in getting instance from Multithreads
    public static DoublyLocked getInstance() {
        if (instance == null) {
           synchronized (DoublyLocked.class) {
               if (instance == null) {
                   instance = new DoublyLocked();
               }
           }
        }
        return instance;
    }
}
