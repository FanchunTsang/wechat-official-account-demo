package com.fanchuntsang.wechatofficialaccount.handler;

import org.apache.commons.lang3.StringUtils;

public class TextEventHandler extends WechatEventBaseHandler {

    public TextEventHandler(String toUserName, String fromUserName, String createTime, String msgType, String content, String msgId, String event, String eventKey) {
        super(toUserName, fromUserName, createTime, msgType, content, msgId, event, eventKey);
    }

    @Override
    public String response() {
        if (StringUtils.isBlank(content)) {
            return "success";
        }
        if (StringUtils.containsAny(content, "你好", "hello", "hi", "Hello", "Hi")) {
            return replyHello(fromUserName, toUserName);
        } else if (StringUtils.containsAny(content, "你是")) {
            return replyIam(fromUserName, toUserName);
        }
        return "success";
    }

    protected String replyHello(String toUser, String fromUser) {
        return createReplyBody(toUser, fromUser, "你好,我是Tom");
    }

    protected String replyIam(String toUser, String fromUser) {
        return createReplyBody(toUser, fromUser, "我是Thomas的玩具Tom");
    }
}
