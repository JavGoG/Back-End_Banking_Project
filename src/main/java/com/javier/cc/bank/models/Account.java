package com.javier.cc.bank.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "accounts")
public class Account{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "number")
    private long number;

    @Column(name = "type")
    private String type;

    @ManyToOne
    @JsonIgnoreProperties({"accounts"})
    @JoinColumn(name = "customer_id", nullable = false )
    private Customer customer;

    public Account(long number, String type, Customer customer) {
        this.number = number;
        this.type = type;
        this.customer = customer;
    }
    public Account(){}

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public long getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }


}
