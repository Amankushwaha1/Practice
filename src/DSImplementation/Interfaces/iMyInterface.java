package DSImplementation.Interfaces;

public interface iMyInterface {
    public void isreq() ;

    default void dbg(){
        System.out.println("Logging from Interface");
    }

}
