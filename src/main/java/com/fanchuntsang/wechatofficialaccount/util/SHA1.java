package com.fanchuntsang.wechatofficialaccount.util;

import java.util.Arrays;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

public class SHA1 {
    public SHA1() {
    }

    public static String gen(String... arr) {
        if (StringUtils.isAnyEmpty(arr)) {
            throw new IllegalArgumentException("非法请求参数，有部分参数为空 : " + Arrays.toString(arr));
        } else {
            Arrays.sort(arr);
            StringBuilder sb = new StringBuilder();
            for (String s : arr){
                sb.append(s);
            }
            return DigestUtils.sha1Hex(sb.toString());
        }
    }

}
