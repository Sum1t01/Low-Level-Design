package CompositeDesignPattern.ExpressionEvaluation;
import CompositeDesignPattern.ExpressionEvaluation.ArithmeticExpression.*;

public class Main {
    public static void main(String args[])
    {
        ArithmeticExpression one = new Numbers(1);
        ArithmeticExpression two = new Numbers(2);
        ArithmeticExpression three = new Numbers(3);


        ArithmeticExpression exp1 = new Expressions(two, three, "MULTIPLY");
        ArithmeticExpression exp2 = new Expressions(one, exp1, "ADD");

        System.out.println(exp2.evaluate());
    }
}
