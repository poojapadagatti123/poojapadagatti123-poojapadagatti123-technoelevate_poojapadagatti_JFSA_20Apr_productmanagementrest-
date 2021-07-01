package com.te.productmanagementrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.productmanagementrest.DAO.AdminDAO;
import com.te.productmanagementrest.beans.AdminBean;
	
	
 	

public class AdminServiceImplementation implements AdminService{
	
	@Autowired
	AdminDAO dao;

	@Override
	public AdminBean authenticate(int id, String password) {
		
		if (id <= 0) {
			return null;
		}
		return dao.authenticate(id, password);
		
		
		
	}

}
