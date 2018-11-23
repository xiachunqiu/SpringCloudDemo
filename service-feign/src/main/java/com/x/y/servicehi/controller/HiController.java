package com.x.y.servicehi.controller;

import com.x.y.servicehi.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class HiController {
    private final SchedualServiceHi schedualServiceHi;

    @Autowired
    public HiController(SchedualServiceHi schedualServiceHi) {
        this.schedualServiceHi = schedualServiceHi;
    }

    @GetMapping(value = "/setUserName")
    public String setUserName(HttpServletRequest request, @RequestParam(value = "name") String name) {
        HttpSession session = request.getSession();
        session.setAttribute("username", name);
        return "成功";
    }

    @GetMapping(value = "/hi")
    public String sayHi(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        return schedualServiceHi.sayHiFromClientOne(username);
    }
}