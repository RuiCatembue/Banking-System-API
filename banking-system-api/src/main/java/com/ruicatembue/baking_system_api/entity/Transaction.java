package com.ruicatembue.baking_system_api.entity;
import com.ruicatembue.baking_system_api.enums.TransactionType;

import java.time.LocalDateTime;

public class Transaction {
    private Long id;
    private Double amount;
    public TransactionType type;
    private LocalDateTime timestamp;
    private Account account;
    private String description;

}
