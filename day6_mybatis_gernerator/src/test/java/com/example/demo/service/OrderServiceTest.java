package com.example.demo.service;

import com.example.demo.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@Slf4j
@SpringBootTest
class OrderServiceTest {
	@Resource
	private OrderService orderService;


	@Test
	void findById() {
		Order order = orderService.findByOrderNo("N001");
		log.info("order: {}", order);
	}


}