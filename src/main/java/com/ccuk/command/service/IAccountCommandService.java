package com.ccuk.command.service;

import java.util.concurrent.CompletableFuture;

import com.ccuk.dto.AccountCreateDTO;
import com.ccuk.dto.MoneyCreditDTO;
import com.ccuk.dto.MoneyDebitDTO;

public interface IAccountCommandService {
	public CompletableFuture<String> createAccount(AccountCreateDTO accountCreateDTO);

	public CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO moneyCreditDTO);

	public CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO moneyDebitDTO);
}
