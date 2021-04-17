package com.example.demo.service.impl;

import com.example.demo.mapper.OrderMapper;
import com.example.demo.model.Order;
import com.example.demo.model.OrderExample;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderMapper orderMapper;

	//mbGenerator
	@Override
	public Order findByOrderNo(String orderNo) {
		OrderExample example = new OrderExample();
		example.createCriteria().andOrderNoEqualTo(orderNo);
		List<Order> list = orderMapper.selectByExample(example);
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}
}