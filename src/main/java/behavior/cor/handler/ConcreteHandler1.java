package behavior.cor.handler;

import behavior.cor.request.Request;
import behavior.cor.request.RequestType;

/**
 * @since 2019/2/15
 */
public class ConcreteHandler1 extends Handler {

    public ConcreteHandler1(Handler successor) {
        super(successor);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE1) {
            System.out.println(request.getName() +
                    " is handle by ConcreteHandler1");
        } else {
            System.out.println("ConcreteHanler1 can't handle "
                    + request.getName());
        }
        if (successor != null) {
            // 把请求交给下一个处理器处理
            successor.handleRequest(request);
        }
    }
}
