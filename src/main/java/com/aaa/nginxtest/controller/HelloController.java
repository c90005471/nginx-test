package com.aaa.nginxtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author ：Teacher陈
 * @date ：Created in 2020/8/1 17:41
 * @description：fdsaf
 * @modified By：
 * @version: 1.0
 */
@Controller
public class HelloController {
    @RequestMapping("/toHello")
    public String toHello(HttpSession session){
        
        return "hello";
    }
}
