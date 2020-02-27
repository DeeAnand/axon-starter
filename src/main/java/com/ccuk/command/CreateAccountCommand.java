package com.ccuk.command;

import com.cccuk.base.command.BaseCommand;

public class CreateAccountCommand extends BaseCommand<String> {

	public double accountBalance;
	public String currency;

	public CreateAccountCommand(String id, double accountBalance, String currency) {
		super(id);
		this.accountBalance = accountBalance;
		this.currency = currency;
	}
	
	public CreateAccountCommand() {
		// TODO Auto-generated constructor stub
	}

}
