package com.honeo.sb2ng7;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "test", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class TestController {

    @GetMapping
    public String get(){
        return "hello";
    }
}
