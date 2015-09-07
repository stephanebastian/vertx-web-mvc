package com.thesoftwarefactory.vertx.web.mvc.impl;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.User;
import io.vertx.ext.web.Cookie;
import io.vertx.ext.web.FileUpload;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.Session;

public class RoutingContextWrapper implements RoutingContext {

	private RoutingContext decoratedContext;

	public RoutingContextWrapper(RoutingContext decoratedContext) {
		Objects.requireNonNull(decoratedContext);
		
		this.decoratedContext = decoratedContext;
	}
	
	public int addBodyEndHandler(Handler<Void> handler) {
		return decoratedContext.addBodyEndHandler(handler);
	}

	public RoutingContext addCookie(Cookie cookie) {
		return decoratedContext.addCookie(cookie);
	}

	public int addHeadersEndHandler(Handler<Future> handler) {
		return decoratedContext.addHeadersEndHandler(handler);
	}

	public void clearUser() {
		decoratedContext.clearUser();
	}

	public int cookieCount() {
		return decoratedContext.cookieCount();
	}

	public Set<Cookie> cookies() {
		return decoratedContext.cookies();
	}

	public Route currentRoute() {
		return decoratedContext.currentRoute();
	}

	public Map<String, Object> data() {
		return decoratedContext.data();
	}

	public void fail(int statusCode) {
		decoratedContext.fail(statusCode);
	}

	public void fail(Throwable throwable) {
		decoratedContext.fail(throwable);
	}

	public boolean failed() {
		return decoratedContext.failed();
	}

	public Throwable failure() {
		return decoratedContext.failure();
	}

	public Set<FileUpload> fileUploads() {
		return decoratedContext.fileUploads();
	}

	public <T> T get(String key) {
		return decoratedContext.get(key);
	}

	public String getAcceptableContentType() {
		return decoratedContext.getAcceptableContentType();
	}

	public Buffer getBody() {
		return decoratedContext.getBody();
	}

	public JsonObject getBodyAsJson() {
		return decoratedContext.getBodyAsJson();
	}

	public String getBodyAsString() {
		return decoratedContext.getBodyAsString();
	}

	public String getBodyAsString(String encoding) {
		return decoratedContext.getBodyAsString(encoding);
	}

	public Cookie getCookie(String name) {
		return decoratedContext.getCookie(name);
	}

	public String mountPoint() {
		return decoratedContext.mountPoint();
	}

	public void next() {
		decoratedContext.next();
	}

	public String normalisedPath() {
		return decoratedContext.normalisedPath();
	}

	public RoutingContext put(String key, Object obj) {
		return decoratedContext.put(key, obj);
	}

	public boolean removeBodyEndHandler(int handlerID) {
		return decoratedContext.removeBodyEndHandler(handlerID);
	}

	public Cookie removeCookie(String name) {
		return decoratedContext.removeCookie(name);
	}

	public boolean removeHeadersEndHandler(int handlerID) {
		return decoratedContext.removeHeadersEndHandler(handlerID);
	}

	public HttpServerRequest request() {
		return decoratedContext.request();
	}

	public HttpServerResponse response() {
		return decoratedContext.response();
	}

	public Session session() {
		return decoratedContext.session();
	}

	public void setAcceptableContentType(String contentType) {
		decoratedContext.setAcceptableContentType(contentType);
	}

	public void setBody(Buffer body) {
		decoratedContext.setBody(body);
	}

	public void setSession(Session session) {
		decoratedContext.setSession(session);
	}

	public void setUser(User user) {
		decoratedContext.setUser(user);
	}

	public int statusCode() {
		return decoratedContext.statusCode();
	}

	public User user() {
		return decoratedContext.user();
	}

	public Vertx vertx() {
		return decoratedContext.vertx();
	}
	
}
