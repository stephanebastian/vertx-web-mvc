package com.thesoftwarefactory.vertx.web.mvc.impl;

import java.util.Objects;

import com.thesoftwarefactory.vertx.web.mvc.HttpStatusCodeResult;

import io.netty.handler.codec.http.HttpResponseStatus;

public class HttpStatusCodeResultImpl extends ActionResultImpl implements HttpStatusCodeResult {

	private String reason;
	
	public HttpStatusCodeResultImpl(HttpResponseStatus status) {
		super(status.code());
		this.reason = status.reasonPhrase();
	}

	public HttpStatusCodeResultImpl(int statusCode, String reason) {
		super(statusCode);
		Objects.requireNonNull(reason);
		this.reason = reason;
	}

	@Override
	public String reason() {
		return reason;
	}

}
