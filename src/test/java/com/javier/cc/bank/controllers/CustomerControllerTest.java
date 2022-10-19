package com.javier.cc.bank.controllers;

import com.javier.cc.bank.models.Account;
import com.javier.cc.bank.models.Customer;
import com.javier.cc.bank.repositories.AccountRepository;
import com.javier.cc.bank.repositories.CustomerRepository;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@ActiveProfiles("test") //Indicates it's a test profile so will not run DataLoader
@SpringBootTest
class CustomerControllerTest {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    AccountRepository accountRepository;

    @Test
    public void contextLoads() {
    }



    @Test
    void getAllCustomers() {

        List<Customer> customers = customerRepository.findAll();
        int size = customers.size();
        System.out.println(size);

    }

    @Test
    void getCustomer() {
    }

    @Test
    void postCustomer() {
    }

    @Test
    void putCustomer() {
    }

    @Test
    void deleteCustomer() {
    }

    @Test
    void getAccountsForCustomer() {
    }
}