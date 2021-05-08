package com.example.demo.service;

import com.example.demo.model.Order;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface OrderService {
	int save(Order order);

	int save(Order order, JdbcTemplate specJdbcTemplate);

	int update(Order order);

	int delete(int id);

	Order findById(int id);

	List<Order> findAll();
}