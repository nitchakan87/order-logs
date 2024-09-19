package com.example.demo.model;

import lombok.Data;

@Data
public class PaymentRequest {
    private String accountNumber;
    private double amount;
    private String currency;
}
