package com.fanchuntsang.wechatofficialaccount.handler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UnsubscribeEventHandler extends WechatEventBaseHandler {

    public UnsubscribeEventHandler(String toUserName, String fromUserName, String createTime, String msgType, String content, String msgId, String event, String eventKey) {
        super(toUserName, fromUserName, createTime, msgType, content, msgId, event, eventKey);
    }

    @Override
    public String response() {
        log.info(String.format("%s has been unsubscribed you", fromUserName));
        return "success";
    }

}
