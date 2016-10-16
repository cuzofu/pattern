package com.cuzofu.pattern.interceptingfilter;

public class Client {
	
	FilterManager filterManager;
	
	public void setFilterManager(FilterManager filterManager) {
		this.filterManager = filterManager;
	}
	
	public void sendRequeset(String request) {
		filterManager.filterRequest(request);
	}

}
