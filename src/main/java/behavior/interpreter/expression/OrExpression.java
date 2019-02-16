package behavior.interpreter.expression;

import lombok.AllArgsConstructor;

/**
 * @since 2019/2/16
 */
@AllArgsConstructor
public class OrExpression extends Expression {

    private Expression expr1;
    private Expression expr2;

    @Override
    public boolean interpret(String str) {
        return expr1.interpret(str) || expr2.interpret(str);
    }
}
