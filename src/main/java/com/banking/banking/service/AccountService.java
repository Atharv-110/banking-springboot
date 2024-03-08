package com.banking.banking.service;

import com.banking.banking.DTO.AccountDTO;

import java.util.List;

public interface AccountService {

    AccountDTO createAccount(AccountDTO accountDTO);

    AccountDTO getAccountById(Long id);

    AccountDTO deposit(Long id, Double amount);

    AccountDTO withdraw(Long id, Double amount);

    List<AccountDTO> getAllAccounts();

    AccountDTO deleteAccountById(Long id);
}
