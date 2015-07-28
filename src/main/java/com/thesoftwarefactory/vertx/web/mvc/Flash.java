package com.thesoftwarefactory.vertx.web.mvc;

import com.thesoftwarefactory.vertx.web.mvc.impl.FlashImpl;

public interface Flash {

	public <T> T get(String key);	
	
	public Flash put(String key, Object value);
	
	public <T> T remove(String key);
	
	public Iterable<String> keys();
	
	public static Flash create() {
		return new FlashImpl();
	}
	
}

