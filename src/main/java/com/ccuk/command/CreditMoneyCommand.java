package com.ccuk.command;

import com.cccuk.base.command.BaseCommand;

public class CreditMoneyCommand extends BaseCommand<String> {

	public double creditAmount;
	public String currency;

	public CreditMoneyCommand(String id, double creditAmount, String currency) {
		super(id);
		this.creditAmount = creditAmount;
		this.currency = currency;
	}
	
	public CreditMoneyCommand() {
		// TODO Auto-generated constructor stub
	}

}

