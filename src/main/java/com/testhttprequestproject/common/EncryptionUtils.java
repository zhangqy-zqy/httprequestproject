package com.testhttprequestproject.common;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import org.springframework.util.StringUtils;

import java.util.Random;

/**
 * @author zhangqianyu on 2019/12/19/019
 */
public class EncryptionUtils {

    /**
     * 使用Base64进行加密
     * @param res 要加密数据信息
     */
    public static String base64Encode(String res) {
        int number = 0;
        String beginString = "";
        String endString = "";
        if(!StringUtils.isEmpty(res)){
            //获取中间字符的下标
            number=res.length()/2;
            //将数据从中间拆分开：头数据
            beginString = res.substring(0, number);
            //将数据从中间拆分开：尾数据
            endString = res.substring(number);
        }
        //首先创建5个随机数 + 头数据  + 4位随机数 + 尾数据 + 6位随机数
        res= randomData(5) + beginString + randomData(4) + endString + randomData(6);
        return Base64.encode(res.getBytes());
    }

    /**
     * 使用Base64进行解密
     * @param res
     */
    public static String base64Decode(String res) {
        if(StringUtils.isEmpty(res)){
            return null;
        }
        String resString = new String(Base64.decode(res));
        String substring = resString.substring(5, resString.length() - 6);
        int beginNumber =(substring.length() / 2)-2;
        String beginString = substring.substring(0, beginNumber);
        int endNumber =(substring.length() / 2)+2;
        String endString = substring.substring(endNumber);
        return beginString+endString;
    }


    /**
     * 取number个随机数
     *
     * @param number 几位随机数
     */
    public static String randomData(int number) {
        String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb=new StringBuilder(number);
        for(int i=0;i<number;i++){
            char ch=str.charAt(new Random().nextInt(str.length()));
            sb.append(ch);
        }
        return  sb.toString();
    }


}
