package com.javier.cc.bank.repositories;


import com.javier.cc.bank.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByNameAndEmailAndUserNameAndAddress(String name, String email, String userName, String address);

    List<Customer> findByNameAndEmailAndUserName(String name, String email, String userName);

    List<Customer> findByNameAndEmail(String name, String email);

    List<Customer> findByName(String name);

}
