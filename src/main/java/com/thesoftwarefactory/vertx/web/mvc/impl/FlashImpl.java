package com.thesoftwarefactory.vertx.web.mvc.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.thesoftwarefactory.vertx.web.mvc.Flash;

public class FlashImpl implements Flash {

	private final static String KEY_MESSAGES = "__messages__";
	private final static String KEY_ERRORS = "__errors__";
	
	private Map<String, Object> map;
	
	@Override
	public List<String> errors() {
		List<String> result = get(KEY_ERRORS);
		if (result==null) {
			result = new ArrayList<>();
		}
		return result;
	}

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
	public List<String> messages() {
		List<String> result = get(KEY_MESSAGES);
		if (result==null) {
			result = new ArrayList<>();
		}
		return result;
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
