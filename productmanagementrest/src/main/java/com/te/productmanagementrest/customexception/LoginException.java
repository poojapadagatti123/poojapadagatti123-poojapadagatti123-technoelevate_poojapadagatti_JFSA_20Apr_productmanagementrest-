package com.te.productmanagementrest.customexception;

public class LoginException extends RuntimeException {
	
	public LoginException(String msg) {
		super(msg);
	}

}
