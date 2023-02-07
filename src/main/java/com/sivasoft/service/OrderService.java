package com.sivasoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sivasoft.entity.Order;
import com.sivasoft.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repository;
	
	
	public Order saveOrder(Order order) {
		return repository.save(order);
	}
	
	
}
