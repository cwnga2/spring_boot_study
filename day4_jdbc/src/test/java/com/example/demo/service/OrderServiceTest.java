package com.example.demo.service;

import com.example.demo.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;


@Slf4j
@SpringBootTest
class OrderServiceTest {
    @Resource
    private OrderService orderService;

    @Test
    void save() {
        Order order = new Order();
        order.setOrderNo("N001");
        order.setAmount(100);
        orderService.save(order);
    }

    @Test
    void update() {
        Order order = new Order();
        order.setId(1);
        order.setAmount(200);
        orderService.update(order);
    }

    @Test
    void delete() {

        orderService.delete(2);
    }

    @Test
    void findById() {
        Order order = orderService.findById(1);
        log.info("order: {}", order);
    }

    @Test
    void findAll() {
        List<Order> orders = orderService.findAll();
        log.info("order: {}", orders);
    }
}