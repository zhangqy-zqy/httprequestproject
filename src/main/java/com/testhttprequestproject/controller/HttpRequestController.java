package com.testhttprequestproject.controller;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangqianyu on 2019/12/3/003
 */

@RestController
@RequestMapping("/alarm")
public class HttpRequestController {

    @PostMapping(value = "/data")
    @ResponseBody
    public Map<String, Object> getData(@RequestBody JSONObject jsonArray) {
        Map<String, Object> responData = new HashMap<>();
        responData.put("retFlag", 0);
        responData.put("code", 200);
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println(jsonArray.toString());
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        return responData;

    }

    @PostMapping(value = "/listdata")
    @ResponseBody
    public Map<String, Object> getListData(@RequestBody List<JSONObject> jsonArray) {
        Map<String, Object> responData = new HashMap<>();
        responData.put("retFlag", 0);
        responData.put("code", 200);
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println(jsonArray.toString());
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        return responData;

    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello World!";

    }
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testMethod() {
        return "Hello World!";

    }
}