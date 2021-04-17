package com.example.demo.service;

import com.example.demo.model.Order;

public interface OrderService {
	//    int save(Order order);
//
//    int update(Order order);
//
//    int delete(int id);
//
//    Order findById(int id);
//
	public Order findByOrderNo(String orderNo);
}