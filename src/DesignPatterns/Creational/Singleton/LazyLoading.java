package DesignPatterns.Creational.Singleton;

public class LazyLoading {

    private LazyLoading() {

    }
    private static LazyLoading instance;
    public static LazyLoading getInstance() {
        if (instance == null) {
            instance = new LazyLoading();
        }
        return instance;
    }

    public void fetchData() {

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
