package com.epuepu.smoothieapp.service;

import com.epuepu.smoothieapp.model.Order;
import com.epuepu.smoothieapp.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getOrdersOfTheUser() {
        return orderRepository.findAll();
    }

    public Order placeOrder(Order order) {
        // validations
        return orderRepository.save(order);
    }
}
