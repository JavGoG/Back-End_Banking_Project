package com.javier.cc.bank.repositories;


import com.javier.cc.bank.models.Account;
import com.javier.cc.bank.models.TypeAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    public List<Account> findAllByTypeAccount(TypeAccount typeAccount);
    public List<Account> findAllByNumber(Long number);
    public List<Account> findAllByCustomerId(Long customerId);
}
