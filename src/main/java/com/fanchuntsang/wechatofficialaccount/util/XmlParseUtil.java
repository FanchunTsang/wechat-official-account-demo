package com.fanchuntsang.wechatofficialaccount.util;

import lombok.extern.slf4j.Slf4j;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

@Slf4j
public class XmlParseUtil {
    private XmlParseUtil() {
    }

    /**
     * 解析XMl内容，转换为POJO类
     *
     * @param clazz 要解析的对象
     * @param xml   解析的xml字符串
     * @return 解析完成的对象
     */
    public static Object convertXmlStrToObject(Class clazz, String xml) {
        Object xmlObject = null;
        try {
            JAXBContext context = JAXBContext.newInstance(clazz);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            StringReader sr = new StringReader(xml);
            xmlObject = unmarshaller.unmarshal(sr);
        } catch (Exception e) {
            log.error("convert xmlStr to object error, msg <{}>", e.getMessage(), e);
        }
        return xmlObject;
    }
}
