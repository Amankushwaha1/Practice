package DesignPatterns.Creational.Singleton;

public class SynchronizedLoading {

    private static SynchronizedLoading instance;

    private SynchronizedLoading() {

    }

    //Other Threads waits
    public static synchronized SynchronizedLoading getInstance() {
        if (instance == null) {
            instance = new SynchronizedLoading();
        }
        return instance;
    }
}
