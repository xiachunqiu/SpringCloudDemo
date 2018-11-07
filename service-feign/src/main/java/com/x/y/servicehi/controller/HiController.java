package com.x.y.servicehi.controller;

import com.x.y.servicehi.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    private final SchedualServiceHi schedualServiceHi;

    @Autowired
    public HiController(SchedualServiceHi schedualServiceHi) {
        this.schedualServiceHi = schedualServiceHi;
    }

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}