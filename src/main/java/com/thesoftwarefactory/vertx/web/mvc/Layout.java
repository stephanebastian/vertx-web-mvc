package com.thesoftwarefactory.vertx.web.mvc;

import com.thesoftwarefactory.vertx.web.mvc.impl.LayoutImpl;

import io.vertx.core.Handler;
import io.vertx.ext.web.RoutingContext;

public interface Layout {

	/**
	 * the path the layout must match
	 * @return
	 */
	public String path();

	/**
	 * the path of the parent layout that this layout will be nested-in
	 * 
	 * @return
	 */
	public String parentPath();

	public Handler<RoutingContext> handler();
	
	public static Layout create(String path, Handler<RoutingContext> handler) {
		return new LayoutImpl(path, handler);
	}

	public static Layout create(String path, String parentPath, Handler<RoutingContext> handler) {
		return new LayoutImpl(path, parentPath, handler);
	}

}
