package com.katabooks.bookonline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.katabooks.bookonline.entity.OrderBook;
import com.katabooks.bookonline.services.OrderService;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController (OrderService orderService){
        this.orderService =orderService;
    }

    @PostMapping
    public OrderBook placeOrder(@RequestParam Long cutomerId, @RequestParam Long bookId){
        return orderService.placeOrder(cutomerId, bookId);

    }

    @GetMapping
    public List<OrderBook> getAllOrders(){
        return orderService.getAllOrders();
    }

}
