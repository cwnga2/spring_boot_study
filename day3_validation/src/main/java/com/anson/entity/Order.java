package com.anson.entity;

import com.anson.valid.Phone;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Data
public class Order {
    @NotEmpty(message = "requestNo can not be empty")
    private String requestNo;

    @Min(value = 1, message = "amount >= 1")
    @Max(value = 100, message = "amount <= 1000")
    private int amount;
    
    @Phone
    private String phone;


}