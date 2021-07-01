package com.te.productmanagementrest.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.te.productmanagementrest.beans.AdminBean;
import com.te.productmanagementrest.customexception.LoginException;

public class AdminDAOImplementation implements AdminDAO {

	@Override
	public AdminBean authenticate(int id, String password) {
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("emsPersistenceUnit");
		EntityManager manager=factory.createEntityManager();
		
		AdminBean infoBean=manager.find(AdminBean.class, id);
		
		if(infoBean !=null) {
			if(infoBean.getPassword().equals(password)) {
				return infoBean;
			}else {
				throw new LoginException("Password is Wrong");
				
			}
			}else {
				throw new LoginException("Invalid id");
		}
		
	}

}
