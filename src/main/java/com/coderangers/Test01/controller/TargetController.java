package com.coderangers.Test01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TargetController {

    @GetMapping("/message")
    public String getMessage() {

        return "hey there!!";
    }
}
