package DesignPatterns.Behavioral.Interpreter;

public class EvaluateExpressionClient {

    private static void sop(Object a) {
        System.out.println(a);
    }
    public static void main(String[] args) {
        sop("Let's Geame Begin");
        IContext context = new IContext();
        context.put("a", new Integer(1));
        context.put("b", new Integer(2));
        context.put("c", new Integer(3));


        iExpressionInterpreter obj =
                new AddInterpreter(new AddInterpreter(new NumberInterpreter("a") , new NumberInterpreter("b"))
                        , new NumberInterpreter("c"));
        sop(obj.interpret(context));
    }
}
