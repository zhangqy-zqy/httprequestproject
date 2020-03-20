package com.testhttprequestproject.test;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;

import java.util.Random;

/**
 * Base64加密测试类
 * @author zhangqianyu on 2019/12/19/019
 */
public class EncryptionBase64Test {

    public static void main(String[] args) {
        /*String name="zhangqy";
        String forword="123456";
        String string = base64Encode(name);
        System.out.println("密文为："+string);
        String resultData = base64Decode(string);
        System.out.println("结果为："+resultData);*/

    }


    /**
     * 使用Base64进行加密
     * @param res
     * @return
     */
    public static String base64Encode(String res) {
        System.out.println("数据res为："+res);
        int number = 0;
        String beginString = "";
        String endString = "";
        if(!StringUtils.isEmpty(res)){
            number=res.length()/2;
            System.out.println("求模number为："+number);
            beginString = res.substring(0, number);
            System.out.println("beginString："+beginString);
            endString = res.substring(number, res.length());
            System.out.println("endString："+endString);
        }
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(randomData(3)).append(beginString).append(randomData(4)).append(endString).append(randomData(2));
        res= stringBuilder.toString();
        System.out.println("拼接后数据："+res);
        return Base64.encode(res.getBytes());
    }

    /**
     * 使用Base64进行解密
     * @param res
     * @return
     */
     public static String base64Decode(String res) {
         System.out.println("--------------------");
         System.out.println("--------------------");
         System.out.println("--------------------");
         System.out.println("密文为："+res);
         if(StringUtils.isEmpty(res)){
             return null;
         }
         String resString = new String(Base64.decode(res));
         System.out.println("拼接数据为："+resString);
         String substring = resString.substring(3, resString.length() - 2);
         System.out.println("中间数据为："+substring);
         int beginNumber =(substring.length() / 2)-2;
         String beginString = substring.substring(0, beginNumber);
         System.out.println("beginString："+beginString);
         int endNumber =(substring.length() / 2)+2;
         String endString = substring.substring(endNumber);
         System.out.println("endString："+endString);
         System.out.println("结果数据为："+beginString+endString);
         return beginString+endString;
     }


    public static String randomData(int number) {
        String str="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder sb=new StringBuilder(number);
        for(int i=0;i<number;i++){
            char ch=str.charAt(new Random().nextInt(str.length()));
            sb.append(ch);
        }
       return  sb.toString();
    }



}
