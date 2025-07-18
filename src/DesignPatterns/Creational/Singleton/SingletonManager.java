package DesignPatterns.Creational.Singleton;

public class SingletonManager {

    private static void sop(Object o) {
        System.out.println(o);
    }
    public static void main(String[] args) {
        sop("Lazy Loading");
        LazyLoading data = LazyLoading.getInstance();
        sop(data.hashCode());
        LazyLoading data2 = LazyLoading.getInstance();
        sop(data2.hashCode());

        sop("Eager Loading");
        EagerLoading data3 = EagerLoading.getInstance();
        sop(data3.hashCode());
        EagerLoading data4 = EagerLoading.getInstance();
        sop(data4.hashCode());

        sop("Synchronized Loading");
        SynchronizedLoading data5 = SynchronizedLoading.getInstance();
        sop(data5.hashCode());
        SynchronizedLoading data6 = SynchronizedLoading.getInstance();
        sop(data6.hashCode());

        sop("Doubly Locked Loading");
        DoublyLocked data7 = DoublyLocked.getInstance();
        sop(data7.hashCode());
        DoublyLocked data8 = DoublyLocked.getInstance();
        sop(data8.hashCode());

        sop("Doubly Locked with Volatile Loading");
        ArchitectureStabilityDoublyLocked data9 = ArchitectureStabilityDoublyLocked.getInstance();
        sop(data9.hashCode());
        ArchitectureStabilityDoublyLocked data10 = ArchitectureStabilityDoublyLocked.getInstance();
        sop(data10.hashCode());
    }
}
