package com.duoc.backend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecuredController {

    @RequestMapping("greetings")
    public String greetings(@RequestParam(defaultValue="World") String name) {
        return "Hello {" + name + "}";
    }
}