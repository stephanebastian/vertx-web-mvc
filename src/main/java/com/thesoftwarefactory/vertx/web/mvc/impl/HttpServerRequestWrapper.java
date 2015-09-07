package com.thesoftwarefactory.vertx.web.mvc.impl;

import java.util.Objects;

import javax.net.ssl.SSLPeerUnverifiedException;
import javax.security.cert.X509Certificate;

import io.vertx.core.Handler;
import io.vertx.core.MultiMap;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServerFileUpload;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.http.HttpVersion;
import io.vertx.core.http.ServerWebSocket;
import io.vertx.core.net.NetSocket;
import io.vertx.core.net.SocketAddress;

public class HttpServerRequestWrapper implements HttpServerRequest {

	private HttpServerRequest decoratedRequest;

	public HttpServerRequestWrapper(HttpServerRequest decoratedRequest) {
		Objects.requireNonNull(decoratedRequest);
		
		this.decoratedRequest = decoratedRequest;
	}
	
	public String absoluteURI() {
		return decoratedRequest.absoluteURI();
	}

	public HttpServerRequest bodyHandler(Handler<Buffer> bodyHandler) {
		return decoratedRequest.bodyHandler(bodyHandler);
	}

	public HttpServerRequest endHandler(Handler<Void> endHandler) {
		return decoratedRequest.endHandler(endHandler);
	}

	public HttpServerRequest exceptionHandler(Handler<Throwable> handler) {
		return decoratedRequest.exceptionHandler(handler);
	}

	public MultiMap formAttributes() {
		return decoratedRequest.formAttributes();
	}

	public String getFormAttribute(String attributeName) {
		return decoratedRequest.getFormAttribute(attributeName);
	}

	public String getHeader(String headerName) {
		return decoratedRequest.getHeader(headerName);
	}

	public String getParam(String paramName) {
		return decoratedRequest.getParam(paramName);
	}

	public HttpServerRequest handler(Handler<Buffer> handler) {
		return decoratedRequest.handler(handler);
	}

	public MultiMap headers() {
		return decoratedRequest.headers();
	}

	public boolean isEnded() {
		return decoratedRequest.isEnded();
	}

	public boolean isExpectMultipart() {
		return decoratedRequest.isExpectMultipart();
	}

	public SocketAddress localAddress() {
		return decoratedRequest.localAddress();
	}

	public HttpMethod method() {
		return decoratedRequest.method();
	}

	public NetSocket netSocket() {
		return decoratedRequest.netSocket();
	}

	public MultiMap params() {
		return decoratedRequest.params();
	}

	public String path() {
		return decoratedRequest.path();
	}

	public HttpServerRequest pause() {
		return decoratedRequest.pause();
	}

	public X509Certificate[] peerCertificateChain() throws SSLPeerUnverifiedException {
		return decoratedRequest.peerCertificateChain();
	}

	public String query() {
		return decoratedRequest.query();
	}

	public SocketAddress remoteAddress() {
		return decoratedRequest.remoteAddress();
	}

	public HttpServerResponse response() {
		return decoratedRequest.response();
	}

	public HttpServerRequest resume() {
		return decoratedRequest.resume();
	}

	public HttpServerRequest setExpectMultipart(boolean expect) {
		return decoratedRequest.setExpectMultipart(expect);
	}

	public ServerWebSocket upgrade() {
		return decoratedRequest.upgrade();
	}

	public HttpServerRequest uploadHandler(Handler<HttpServerFileUpload> uploadHandler) {
		return decoratedRequest.uploadHandler(uploadHandler);
	}

	public String uri() {
		return decoratedRequest.uri();
	}

	public HttpVersion version() {
		return decoratedRequest.version();
	}
	
	
	
}
