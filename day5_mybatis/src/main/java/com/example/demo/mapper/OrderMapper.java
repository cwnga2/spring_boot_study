package com.example.demo.mapper;

import com.example.demo.model.Order;

import java.util.List;

public interface OrderMapper {
	int save(Order order);

	int update(Order order);

	int delete(int orderId);

	Order fineById(int id);

	List<Order> findAll();

}