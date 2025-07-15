package DesignPatterns.Behavioral.Interpreter;


public class NumberInterpreter implements iExpressionInterpreter {
    String variable;

    public NumberInterpreter(String variable) {
        this.variable = variable;
    }
    @Override
    public int interpret(IContext context){
        return context.get(this.variable);
    }
}
