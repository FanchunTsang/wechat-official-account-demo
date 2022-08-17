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

    public static String createReplyBody(String toUser, String fromUser, String content) {
        return "<xml>" +
                "<ToUserName><![CDATA[" + toUser + "]]></ToUserName>" +
                "<FromUserName><![CDATA[" + fromUser + "]]></FromUserName>" +
                "<CreateTime>12345678</CreateTime>" +
                "<MsgType><![CDATA[text]]></MsgType>" +
                "<Content><![CDATA[" + content + "]]></Content>" +
                "</xml>";
    }
}
