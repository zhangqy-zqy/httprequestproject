package com.testhttprequestproject.controller;


import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangqianyu on 2019/12/3/003
 */

@RestController
@RequestMapping("alarm")
public class HttpRequestController {

    @PostMapping(value = "/data")
    @ResponseBody
    public List<Map<String, Object>> getData(@RequestBody List<JSONObject> jsonArray) {
        List<Map<String, Object>> resultListMap=new ArrayList<>();
        Map<String, Object> responData = new HashMap<>();
        responData.put("retFlag", "0");
        responData.put("code", "200");
        resultListMap.add(responData);
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println(jsonArray.toString());
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        return resultListMap;

    }

    @PostMapping(value = "/alarm-data")
    @ResponseBody
    public void getAlarmData(@RequestBody String  jsonObject ) {
        JSONObject responData = new JSONObject();
        responData.put("success", "true");
        responData.put("userName", "ceshi001");
        responData.put("code", 200);
        responData.put("retFlag", 0);
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println(jsonObject);
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //return responData;


    }

    @GetMapping(value = "/alarm-test")
    @ResponseBody
    public Map<String, Object> getListData(@RequestParam String access_token ) {
        Map<String, Object> responData = new HashMap<>();
        responData.put("success", "true");
        responData.put("userName", "ceshi001");
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println(access_token);
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        return responData;

    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        return "{\"errCode\":null,\"message\":null,\"data\":{\"userNo\":\"admin\"}}";

    }
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testMethod() {
        return "Hello World!";

    }
}