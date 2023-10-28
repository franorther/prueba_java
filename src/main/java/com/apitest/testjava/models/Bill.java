package com.apitest.testjava.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "bills")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "bill_id")
    private Long billId;

    @Column(name = "total_amount")
    private Double totalAmount;

    @Column(name = "description")
    private String desc;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
