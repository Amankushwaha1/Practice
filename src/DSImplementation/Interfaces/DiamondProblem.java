package DSImplementation.Interfaces;

//In this case, the code simply won’t compile,
//as there’s a conflict caused by multiple interface inheritance
//(a.k.a the Diamond Problem).
//public class DiamondProblem implements iMyInterface,iMyInterfaceNew{
//
//
//    public void isreq() {
//
//    }

public class DiamondProblem implements iMyInterface,iMyInterfaceNew{


    public void isreq() {
        System.out.println("This is a Diamond -> isreq");
    }

    @Override
    public void dbg(){
        System.out.println("This is a Diamond -> dbg");
    }

    static void avoidDiamondProblem(){
        System.out.println("This is a Diamond -> static avoidDiamondProblem");

    }

}
