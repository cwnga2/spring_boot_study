package com.example.demo.service.impl;

import com.example.demo.mapper.OrderMapper;
import com.example.demo.model.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderMapper orderMapper;

	@Override
	public int save(Order order) {
		return orderMapper.save(order);
	}

	@Override
	public int update(Order order) {
		return orderMapper.update(order);
	}

	@Override
	public int delete(int id) {
		return orderMapper.delete(id);
	}

	@Override
	public Order findById(int id) {
		return orderMapper.fineById(id);
	}

	@Override
	public List<Order> findAll() {
		return orderMapper.findAll();
	}

}