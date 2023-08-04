package com.demo.crud.controller;

import com.demo.crud.entity.Order;
import com.demo.crud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping
    public Order addOrder(@RequestBody Order order){
        return service.addOrder(order);
    }

    @GetMapping
    public List<Order> getOrders(){
        return service.getOrders();
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id){
        return service.getOrderById(id);
    }
}
