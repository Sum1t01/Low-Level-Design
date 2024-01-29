package CompositeDesignPattern.ExpressionEvaluation.ArithmeticExpression;

public class Numbers  implements ArithmeticExpression {
    int num;

    public Numbers(int num)
    {
        this.num = num;
    }

    public int evaluate()
    {
        return num;
    }
}
