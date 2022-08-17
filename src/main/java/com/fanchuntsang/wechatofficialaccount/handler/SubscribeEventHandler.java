package com.fanchuntsang.wechatofficialaccount.handler;

public class SubscribeEventHandler extends WechatEventBaseHandler {

    public SubscribeEventHandler(String toUserName, String fromUserName, String createTime, String msgType, String content, String msgId, String event, String eventKey) {
        super(toUserName, fromUserName, createTime, msgType, content, msgId, event, eventKey);
    }

    @Override
    public String response() {
        return replySubscribe(fromUserName, toUserName);
    }

    protected String replySubscribe(String toUser, String fromUser) {
        return createReplyBody(toUser, fromUser, "你好，欢迎关注战场老师傅。恭喜你，当你看到这条消息的时候，你就要请我喝茶啦！");
    }
}
