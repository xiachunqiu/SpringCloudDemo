package com.x.y.servicehi.fallback;

import com.x.y.servicehi.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        System.out.println("sorry " + name);
        return "sorry " + name;
    }
}