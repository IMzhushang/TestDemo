package com.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/5/27.
 */
@Controller
@RequestMapping("test")
public class TestController {
    @RequestMapping(value = "first", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> first(String name) {
       System.err.println("get ----------------->" + name);
        return ResponseEntity.status(200).body("is ok");
    }
}
