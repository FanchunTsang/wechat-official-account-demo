package com.fanchuntsang.wechatofficialaccount.handler;

import com.fanchuntsang.wechatofficialaccount.pojo.Event;

public class EventHandlerBuilder {
    public WechatEventBaseHandler build(Event event) {
        switch (event.getMsgType()) {
            case "text":
                return new TextEventHandler(event.getToUserName(), event.getFromUserName(), event.getCreateTime(), event.getMsgType(), event.getContent(), event.getMsgId(), event.getEvent(), event.getEventKey());
            case "event":
                return null;
            default:
                return null;
        }
    }
}
