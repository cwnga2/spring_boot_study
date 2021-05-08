package com.example.demo.model;

import lombok.Data;

@Data
public class Order {
    private int id;
    private String orderNo;
    private int amount;
}