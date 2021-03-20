package com.anson.controller;

import com.anson.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validator;
import java.util.Iterator;
import java.util.Set;

@Slf4j
@RestController
public class TestPostController {
    @Autowired
    Validator validator;

    @PostMapping("/test")
    public String buy(@Valid Order order) {

        log.info("order---->:{}", order);
        return "success";
    }

    @PostMapping("/testNoException")
    public void buy(@Valid Order order, BindingResult result) {
        System.out.println(result);
        log.info("order---->:{}", order);
        return;
    }

    @PostMapping("/testJsonNoException")
    public void buy2(@Valid @RequestBody Order order, BindingResult result) {
        System.out.println(result);
        log.info("order---->:{}", order);
        return;
    }

    @PostMapping("/testJson")
    public void buy2(@Valid @RequestBody Order order) {

        log.info("order---->:{}", order);
        return;
    }

    @GetMapping("/testJson")
    public Object buy2() {
        Order order = new Order();
        order.setAmount(2);
        order.setRequestNo("");
        order.setPhone("1");


        Set<ConstraintViolation<Order>> validate = validator.validate(order);
        String result = "";
        Iterator<ConstraintViolation<Order>> iterator = validate.iterator();
        while (iterator.hasNext()) {
            ConstraintViolation violation = iterator.next();
            result = result + "," + violation.getMessage();
        }
        return result;
    }
}