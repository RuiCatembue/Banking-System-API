package com.ruicatembue.baking_system_api.entity;

import com.ruicatembue.baking_system_api.enums.AccountStatus;

import java.time.LocalDateTime;

public class Account {
    private Long id;
    private String accountNumber;
    private Double balance;
    private AccountStatus status;
    private LocalDateTime createdAt;
    private Customer customer;



}
