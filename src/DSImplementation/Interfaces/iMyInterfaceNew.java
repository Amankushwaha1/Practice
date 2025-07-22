package DSImplementation.Interfaces;

public interface iMyInterfaceNew {

    default void dbg(){
        System.out.println("iMyInterfaceNew interface dbg");
    }

    static void dbg2(){
        System.out.println("iMyInterfaceNew interface dbg2");
    }

}
