package com.javier.cc.bank;

import com.javier.cc.bank.models.Account;

import com.javier.cc.bank.models.Customer;
import com.javier.cc.bank.repositories.AccountRepository;
import com.javier.cc.bank.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ActiveProfiles("test") //Indicates it's a test profile so will not run DataLoader
@SpringBootTest
class BankApplicationTests {

	@Autowired
	@Nested
	AccountRepository accountRepository;

	@Autowired
	CustomerRepository customerRepository;


	// Verify if the application is able to load Spring context successfully (Shorthand for "ApplicationContext",
	// which is the programming construction that the framework uses to access components from the Inversion-of-Control container
	// where they are cached)
	@Test
	public void contextLoads() {
	}

	@Test
	public void createCustomerAndAccountThenSave(){
		char[] password = {'p','a','s','s','w','o','r','d'};
		Customer customer = new Customer("Jane", "Edinburgh Street", password,"janemartin@gmail.com", "janeMartin");
		customerRepository.save(customer);
		Account account = new Account(123456, Account.TypeAccount.SAVINGS,customer);
		accountRepository.save(account);

	}
	@Test
	public void findCustomerByNameAndEmail(){
		List<Customer> found = customerRepository.findByNameAndEmail("Jane", "janemartin@gmail.com");
		assertEquals("Jane",found.get(0).getName());
	}

	@Test
	public void findCustomerByNameAndEmailAndUserNameAndAddress(){
		List<Customer> found = customerRepository.findByNameAndEmailAndUserNameAndAddress("Jane", "janemartin@gmail.com", "janeMartin", "Edinburgh Street");
		assertEquals("Jane", found.get(0).getName());
	}

	@Test
	public void findAllAccountsByNumber(){
		List<Account> found = accountRepository.findAllByNumber(123456L);
		assertEquals(123456, found.get(0).getNumber());
	}


}
