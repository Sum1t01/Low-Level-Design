package CompositeDesignPattern.ExpressionEvaluation.ArithmeticExpression;

public class Expressions implements ArithmeticExpression {
    ArithmeticExpression left, right;
    String operation;

    public Expressions(ArithmeticExpression left, ArithmeticExpression right, String operation)
    {
        this.left = left;
        this.right = right;
        this.operation = operation;
    }

    public int evaluate()
    {
        if(operation=="ADD")
        {
            return left.evaluate()+right.evaluate();

        }
        else if(operation == "SUBTRACT")
        {
            return left.evaluate()-right.evaluate();
        }
        else if(operation=="DIVIDE")
        {
            return left.evaluate()/right.evaluate();
        }
        else if(operation=="MULTIPLY")
        {
            return left.evaluate()*right.evaluate();
        }
        return -1;
    }
}
