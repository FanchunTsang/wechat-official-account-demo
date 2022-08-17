package com.fanchuntsang.wechatofficialaccount.pojo;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Data
@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class Event implements Serializable {
    private static final long serialVersionUID = 1L;
    @XmlElement(name = "ToUserName", nillable = true)
    String toUserName;
    @XmlElement(name = "FromUserName", nillable = true)
    String fromUserName;
    @XmlElement(name = "CreateTime", nillable = true)
    String createTime;
    @XmlElement(name = "MsgType", nillable = true)
    String msgType;
    @XmlElement(name = "Content", nillable = true)
    String content;
    @XmlElement(name = "MsgId", nillable = true)
    String msgId;
    @XmlElement(name = "Event", nillable = true)
    String event;
    @XmlElement(name = "EventKey", nillable = true)
    String eventKey;
}
