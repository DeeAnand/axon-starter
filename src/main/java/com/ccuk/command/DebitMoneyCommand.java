package com.ccuk.command;

import com.cccuk.base.command.BaseCommand;

public class DebitMoneyCommand extends BaseCommand<String> {
    public double debitAmount;
   
    public String currency;
    
    public DebitMoneyCommand(String id, double debitAmount, String currency) {
        super(id);
        this.debitAmount = debitAmount;
        this.currency = currency;
    }
    
    public DebitMoneyCommand() {
		// TODO Auto-generated constructor stub
	}
}

