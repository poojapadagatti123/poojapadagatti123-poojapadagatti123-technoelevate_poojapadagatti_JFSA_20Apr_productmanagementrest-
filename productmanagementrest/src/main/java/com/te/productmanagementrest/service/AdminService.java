package com.te.productmanagementrest.service;

import org.springframework.stereotype.Service;

import com.te.productmanagementrest.beans.AdminBean;


public interface AdminService {
	
	public AdminBean authenticate(int id, String password);
	
	

}
