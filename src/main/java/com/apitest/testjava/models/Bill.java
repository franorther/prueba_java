package com.apitest.testjava.models;

import jakarta.persistence.*;

@Entity

public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bill_id")
    private Long billId;
    @Column(name = "total_amount")
    private Double totalAmount;
    @Column(name = "description")
    private String desc;
}
