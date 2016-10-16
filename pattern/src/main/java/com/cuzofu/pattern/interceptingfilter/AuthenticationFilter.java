package com.cuzofu.pattern.interceptingfilter;

public class AuthenticationFilter implements Filter {

	public void execute(String request) {
		System.out.println("Authenticating request: " + request);
	}

}
