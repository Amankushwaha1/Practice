package DesignPatterns.Creational.Singleton;

public class EagerLoading {

    private static final EagerLoading instance = new EagerLoading();
    private EagerLoading() {

    }
    public static EagerLoading getInstance() {
        return instance;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
