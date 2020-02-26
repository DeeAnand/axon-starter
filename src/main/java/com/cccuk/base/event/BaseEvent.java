package com.cccuk.base.event;

public class BaseEvent<T> {
	public final T id;

	public BaseEvent(T id) {
		this.id = id;
	}
}
