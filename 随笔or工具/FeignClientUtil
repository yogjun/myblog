@Slf4j
public class FeignClientUtil {
    public static <T,S> S serviceInvokeWithResponse(T request, Function<T,MessagePack<S>> function) {
        S response = null;
        try {
            log.debug("remote请求，{}", request);
            MessagePack<S> messagePack = function.apply(request);
            if (Objects.nonNull(messagePack) && Objects
                .equals(messagePack.getCode(), CommonBizCode.SUCCESS.getErrorCode())) {
                response = messagePack.getData();
            }
        } catch (Exception e) {
            log.error("remote请求失败", e);
        }
        log.debug("remote响应，{}", response);
        return response;
    }

    public static <T,S> MessagePack<S> serviceInvokeWithMessagePack(T request, Function<T,MessagePack<S>> function) {
        MessagePack<S> msg = null;
        try {
            log.debug("remote请求，{}", request);
            msg = function.apply(request);
        } catch (Exception e) {
            log.error("remote请求失败", e);
            msg = MessagePack.<S>newMsg().code(CommonBizCode.ERROR.getErrorCode()).msg("调用失败");
        }
        log.debug("remote响应，{}", msg);
        return msg;
    }
}
