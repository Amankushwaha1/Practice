package DesignPatterns.Behavioral.Interpreter;


public class AddInterpreter implements iExpressionInterpreter {

    iExpressionInterpreter leftExpression;
    iExpressionInterpreter rightExpression;

    public AddInterpreter(iExpressionInterpreter leftExpression, iExpressionInterpreter rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(IContext context){
        return leftExpression.interpret(context)+rightExpression.interpret(context);
    }
}
