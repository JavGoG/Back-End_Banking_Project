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
        char [] password1 = {'p', 'a', 's', 's', 'w', 'o', 'r', 'd'};
        Customer customer1 = new Customer("Michael Knight", " 4 Liberton Park", password1, "michaelknight@gmail.com", "Michael");
        customerRepository.save(customer1);
        Account accountS1 = new Account(1234, Account.TypeAccount.SAVINGS, customer1);
        accountRepository.save(accountS1);
        List<Customer> customers = customerRepository.findAll();
        System.out.println(customers);

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