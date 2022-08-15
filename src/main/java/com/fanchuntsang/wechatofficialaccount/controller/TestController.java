package com.fanchuntsang.wechatofficialaccount.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {
    @RequestMapping("/1")
    public String test() {
        return "success";
    }
}
