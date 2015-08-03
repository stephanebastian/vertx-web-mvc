package com.thesoftwarefactory.vertx.web.mvc.impl;

import com.thesoftwarefactory.vertx.web.mvc.ActionResult;

import io.netty.handler.codec.http.HttpResponseStatus;

public abstract class ActionResultImpl implements ActionResult {

	private int statusCode;

	public ActionResultImpl(int statusCode) {
		this.statusCode = statusCode;
	}

	public ActionResultImpl() {
		this(HttpResponseStatus.OK.code());
	}
	
	@Override
	public int statusCode() {
		return statusCode;
	}

}
