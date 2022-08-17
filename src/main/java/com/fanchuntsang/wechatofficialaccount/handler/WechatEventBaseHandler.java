package com.fanchuntsang.wechatofficialaccount.handler;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class WechatEventBaseHandler {
    String toUserName;
    String fromUserName;
    String createTime;
    String msgType;
    String content;
    String msgId;
    String event;
    String eventKey;

    public abstract String response();
}
