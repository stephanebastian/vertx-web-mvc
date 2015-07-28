package com.thesoftwarefactory.vertx.web.mvc.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.thesoftwarefactory.vertx.web.mvc.Flash;

public class FlashImpl implements Flash {

	private Map<String, Object> map;
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T get(String key) {
		return map!=null ? (T) map.get(key) : null;
	}

	@Override
	public Iterable<String> keys() {
		return map!=null ? map.keySet() : Collections.emptyList();
	}

	@Override
	public Flash put(String key, Object value) {
		if (map==null) {
			map = new HashMap<>();
		}
		map.put(key, value);
		return this;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T remove(String key) {
		return map!=null ? (T) map.remove(key) : null;
	}

}
