package com.example.demo.service;

import com.example.demo.model.Order;

import java.util.List;

public interface OrderService {
    int save(Order order);

    int update(Order order);

    int delete(int id);

    Order findById(int id);

    List<Order> findAll();
}