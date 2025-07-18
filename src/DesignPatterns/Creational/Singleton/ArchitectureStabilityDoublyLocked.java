package DesignPatterns.Creational.Singleton;

public class ArchitectureStabilityDoublyLocked {

    //volatile solve machine architecture config
    //Temp cache evict as well as multicore switching problem
    //(No Temp cache for obj + Thread within core can switch)
    private static volatile ArchitectureStabilityDoublyLocked instance;
    private ArchitectureStabilityDoublyLocked() {

    }
    public static ArchitectureStabilityDoublyLocked getInstance() {
        if (instance == null) {
            synchronized (ArchitectureStabilityDoublyLocked.class) {
                if (instance == null) {
                    instance = new ArchitectureStabilityDoublyLocked();
                }
            }
        }
        return instance;
    }
}
