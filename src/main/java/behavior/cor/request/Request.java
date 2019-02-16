package behavior.cor.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @since 2019/2/15
 */
@Getter
@AllArgsConstructor
public class Request {
    private RequestType type;
    private String name;
}
