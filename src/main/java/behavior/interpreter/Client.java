package behavior.interpreter;

import behavior.interpreter.expression.AndExpression;
import behavior.interpreter.expression.Expression;
import behavior.interpreter.expression.OrExpression;
import behavior.interpreter.expression.TerminalExpression;

/**
 * 解释器
 * <p>
 * 为语言创建解释器，通常由语言的语法和语法分析来定义。
 * 如果学习过编译原理，理解起来会更加容易。
 * <p>
 * 实例：<br/>
 * 一个规则检验器实现，具有 and 和 or 规则，通过规则可以构建一颗解析树，
 * 用来检验一个文本是否满足解析树定义的规则。<br/>
 * 例如一颗解析树为 D And (A Or (B C))，文本 "D A" 满足该解析树定义的规则。
 *
 * @since 2019/2/16
 */
public class Client {

    public static void main(String[] args) {
        Expression define = buildParseTree();
        String context1 = "D A";
        String context2 = "A B";
        String context3 = "D B";
        String context4 = "D B C";
        System.out.println(define.interpret(context1)); // true
        System.out.println(define.interpret(context2)); // false
        System.out.println(define.interpret(context3)); // true
        System.out.println(define.interpret(context4)); // true
    }

    /**
     * 构建解析树
     *
     * @return "D And (A Or (B C))" 解析器
     */
    private static Expression buildParseTree() {
        // Literal
        Expression terminal1 = new TerminalExpression("A");
        Expression terminal2 = new TerminalExpression("B");
        Expression terminal3 = new TerminalExpression("C");
        Expression terminal4 = new TerminalExpression("D");
        // B C
        Expression alternation1 = new OrExpression(terminal2, terminal3);
        // A Or (B C)
        Expression alternation2 = new OrExpression(terminal1, alternation1);
        // D And (A Or (B C))
        return new AndExpression(terminal4, alternation2);
    }

}
