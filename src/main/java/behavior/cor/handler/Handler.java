package behavior.cor.handler;

import behavior.cor.request.Request;

/**
 * @since 2019/2/15
 */
public abstract class Handler {
    protected Handler successor; // 后继者

    public Handler(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}
