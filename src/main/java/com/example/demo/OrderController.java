package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.PaymentRequest;
import com.example.demo.service.PaymentService;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/submit")
    public String submitOrder(@RequestBody PaymentRequest paymentRequest) {
        paymentService.submitOrder(paymentRequest);
        return "Order submitted successfully.";
    }
}