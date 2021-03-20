package com.anson.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotEmpty;

@Validated
@RestController
public class AccountController {
    @GetMapping("/accountAmount")
    public String getAccountAmount(@NotEmpty String accountNo) {
        return "1000";
    }
}