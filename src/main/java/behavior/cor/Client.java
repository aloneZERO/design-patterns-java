package behavior.cor;

import behavior.cor.handler.ConcreteHandler1;
import behavior.cor.handler.ConcreteHandler2;
import behavior.cor.handler.Handler;
import behavior.cor.request.Request;
import behavior.cor.request.RequestType;

/**
 * 责任链（Chain Of Responsibility）
 * <p>
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
 * 将这些对象连成一条链，并沿着这条链发送该请求，直到有一个对象处理它为止。
 *
 * @since 2019/2/15
 */
public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1(null);
        Handler handler2 = new ConcreteHandler2(handler1);

        Request request1 = new Request(RequestType.TYPE1, "request1");
        handler2.handleRequest(request1);

        System.out.println("--------------------------------------------");

        Request request2 = new Request(RequestType.TYPE2, "request2");
        handler2.handleRequest(request2);
    }
}
