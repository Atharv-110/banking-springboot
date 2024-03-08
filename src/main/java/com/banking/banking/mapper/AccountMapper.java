package com.banking.banking.mapper;

import com.banking.banking.DTO.AccountDTO;
import com.banking.banking.entity.Account;

public class AccountMapper {
    public static Account mapToAccount(AccountDTO accountDTO) {

        return new Account(
                accountDTO.getId(), accountDTO.getAccountHolderName(), accountDTO.getBalance()
        );
    }

    public static AccountDTO mapToAccountDTO(Account account){

        return new AccountDTO(
                account.getId(), account.getAccountHolderName(), account.getBalance()
        );
    }

}