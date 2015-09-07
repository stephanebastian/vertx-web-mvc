package com.thesoftwarefactory.vertx.web.mvc.impl;

import java.util.Objects;

import com.thesoftwarefactory.vertx.web.mvc.Layout;

import io.vertx.core.Handler;
import io.vertx.ext.web.RoutingContext;

public class LayoutImpl implements Layout {

	private String path;
	private String parentPath;
	private Handler<RoutingContext> handler;
	
	public LayoutImpl(String path, Handler<RoutingContext> handler) {
		Objects.requireNonNull(path);
		Objects.requireNonNull(handler);

		this.path = path;
		this.handler = handler;
	}
	
	public LayoutImpl(String path, String parentPath, Handler<RoutingContext> handler) {
		Objects.requireNonNull(path);
		Objects.requireNonNull(parentPath);
		Objects.requireNonNull(handler);
		
		this.path = path;
		this.parentPath = parentPath;
		this.handler = handler;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LayoutImpl other = (LayoutImpl) obj;
		if (path == null) {
			if (other.path != null)
				return false;
		} else if (!path.equals(other.path))
			return false;
		return true;
	}

	public Handler<RoutingContext> handler() {
		return handler;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((path == null) ? 0 : path.hashCode());
		return result;
	}

	public String parentPath() {
		return parentPath;
	}
	
	public String path() {
		return path;
	}
	
}
