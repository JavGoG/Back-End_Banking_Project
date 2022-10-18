package com.javier.cc.bank.controllers;

import com.javier.cc.bank.models.Account;
import com.javier.cc.bank.repositories.AccountRepository;
import com.javier.cc.bank.repositories.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@ActiveProfiles("test") //Indicates it's a test profile so will not run DataLoader
@SpringBootTest
class AccountControllerTest {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    CustomerRepository customerRepository;


    @BeforeEach
    void setUp() {
    }

    @Test
    void getAccount() {
        final Optional<Account> account = accountRepository.findById((long) 1);
        System.out.println(account.toString());

    }

    @Test
    void postAccount() {
    }

    @Test
    void putAccount() {
    }

    @Test
    void deleteAccount() {
    }

    @Test
    void getCustomerForAccount() {
    }

    @Test
    void getAccountByType() {
    }

    @Test
    void getAccountByNumber() {
    }

    @Test
    void testGetAccount() {
    }

    @Test
    void testPostAccount() {
    }

    @Test
    void testPutAccount() {
    }

    @Test
    void testDeleteAccount() {
    }

    @Test
    void testGetCustomerForAccount() {
    }

    @Test
    void testGetAccountByType() {
    }

    @Test
    void testGetAccountByNumber() {
    }

    @Test
    void testGetAccount1() {
    }

    @Test
    void testPostAccount1() {
    }

    @Test
    void testPutAccount1() {
    }

    @Test
    void testDeleteAccount1() {
    }

    @Test
    void testGetCustomerForAccount1() {
    }

    @Test
    void testGetAccountByType1() {
    }

    @Test
    void testGetAccountByNumber1() {
    }
}