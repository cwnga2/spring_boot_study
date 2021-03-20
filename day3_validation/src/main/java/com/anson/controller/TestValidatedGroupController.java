package com.anson.controller;

import com.anson.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Validator;

@Slf4j
@RestController
public class TestValidatedGroupController {
    @Autowired
    Validator validator;

    @PostMapping("/saveBasicUser")
    public Object saveBasicUser(@Validated(User.BasicUser.class) User user, BindingResult result) {

        log.info("order---->:{}", result.getAllErrors());
        return result.getAllErrors();
    }

    @PostMapping("/saveDetailUser")
    public Object detailUser(@Validated(User.DetailUser.class) User user) {


    return null;
    }

}