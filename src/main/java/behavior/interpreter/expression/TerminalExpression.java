package behavior.interpreter.expression;

import lombok.AllArgsConstructor;

import java.util.StringTokenizer;

/**
 * 终结符表达式，每个终结符都需要一个 TerminalExpression
 *
 * @since 2019/2/16
 */
@AllArgsConstructor
public class TerminalExpression extends Expression {

    private String literal; // 文字

    @Override
    public boolean interpret(String str) {
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            String test = st.nextToken();
            if (test.equals(literal)) {
                return true;
            }
        }
        return false;
    }
}
