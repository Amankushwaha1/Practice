package DSImplementation.Interfaces;

public class DefaultExecutor {
    public static void main(String[] args) {

        iMyInterface obj = new DefaultMethodImpl();
        obj.isreq();
        obj.dbg();

        obj = new DefaultOverride();
        obj.isreq();
        obj.dbg();

        //Go through DiamandProblem Class
        DiamondProblem.avoidDiamondProblem();

        //static methods in interfaces
        iMyInterfaceNew.dbg2();

    }
}
