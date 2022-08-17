package com.fanchuntsang.wechatofficialaccount.handler;

import com.fanchuntsang.wechatofficialaccount.pojo.Event;

public class EventHandlerBuilder {
    public WechatEventBaseHandler build(Event event) {
        switch (event.getMsgType()) {
            case "text":
                return new TextEventHandler(event.getToUserName(), event.getFromUserName(), event.getCreateTime(), event.getMsgType(), event.getContent(), event.getMsgId(), event.getEvent(), event.getEventKey());
            case "event":
                return eventHandle(event);
            default:
                return null;
        }
    }

    protected WechatEventBaseHandler eventHandle(Event event) {
        switch (event.getEvent()) {
            case "subscribe":
                return new SubscribeEventHandler(event.getToUserName(), event.getFromUserName(), event.getCreateTime(), event.getMsgType(), event.getContent(), event.getMsgId(), event.getEvent(), event.getEventKey());
            case "unsubscribe":
                return new UnsubscribeEventHandler(event.getToUserName(), event.getFromUserName(), event.getCreateTime(), event.getMsgType(), event.getContent(), event.getMsgId(), event.getEvent(), event.getEventKey());
            default:
                return null;
        }
    }
}
