package com.thesoftwarefactory.vertx.web.mvc;

import java.util.List;

import com.thesoftwarefactory.vertx.web.mvc.impl.FlashImpl;

public interface Flash {

	public static Flash create() {
		return new FlashImpl();
	}	
	
	public List<String> errors();
	
	public <T> T get(String key);
	
	public Iterable<String> keys();
	
	public List<String> messages();
	
	public Flash put(String key, Object value);

	public <T> T remove(String key);

}

