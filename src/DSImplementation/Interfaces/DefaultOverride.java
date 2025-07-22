package DSImplementation.Interfaces;

public class DefaultOverride implements iMyInterface{

    public void isreq(){
        System.out.println("Default Override -> isreq");
    }

    @Override
    public void dbg(){
        System.out.println("Default Override -> dbg");
    }

}
