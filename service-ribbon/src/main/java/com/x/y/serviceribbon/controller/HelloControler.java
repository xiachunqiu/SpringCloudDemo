package com.x.y.serviceribbon.controller;

import com.x.y.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class HelloControler {
    private final HelloService helloService;

    @Autowired
    public HelloControler(HelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping(value = "/hi")
    public String hi(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        return helloService.hiService(username);
    }
}