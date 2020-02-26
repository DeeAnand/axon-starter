package com.ccuk.command.service;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.stereotype.Service;

import com.ccuk.command.CreateAccountCommand;
import com.ccuk.command.CreditMoneyCommand;
import com.ccuk.command.DebitMoneyCommand;
import com.ccuk.dto.AccountCreateDTO;
import com.ccuk.dto.MoneyCreditDTO;
import com.ccuk.dto.MoneyDebitDTO;

@Service
public class AccountCommandServiceImpl implements IAccountCommandService {

	private final CommandGateway commandGateway;

	public AccountCommandServiceImpl(CommandGateway commandGateway) {
		this.commandGateway = commandGateway;
	}

	@Override
	public CompletableFuture<String> createAccount(AccountCreateDTO accountCreateDTO) {
		return commandGateway.send(new CreateAccountCommand(UUID.randomUUID().toString(),
				accountCreateDTO.getStartingBalance(), accountCreateDTO.getCurrency()));
	}

	@Override
	public CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO moneyCreditDTO) {
		return commandGateway.send(
				new CreditMoneyCommand(accountNumber, moneyCreditDTO.getCreditAmount(), moneyCreditDTO.getCurrency()));
	}

	@Override
	public CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO moneyDebitDTO) {
		return commandGateway.send(
				new DebitMoneyCommand(accountNumber, moneyDebitDTO.getDebitAmount(), moneyDebitDTO.getCurrency()));
	}

}
