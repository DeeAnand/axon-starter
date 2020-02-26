package com.ccuk.event;

import com.cccuk.base.event.BaseEvent;
import com.ccuk.enums.Status;

public class AccountActivatedEvent extends BaseEvent<String> {
	
	public final Status status;

	public AccountActivatedEvent(String id, Status status) {
		super(id);
		this.status = status;
	}
}