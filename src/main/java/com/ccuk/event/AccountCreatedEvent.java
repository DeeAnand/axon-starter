package com.ccuk.event;

import com.cccuk.base.event.BaseEvent;

public class AccountCreatedEvent extends BaseEvent<String> {
	public final double accountBalance;
	public final String currency;

	public AccountCreatedEvent(String id, double accountBalance, String currency) {
		super(id);
		this.accountBalance = accountBalance;
		this.currency = currency;
	}
}