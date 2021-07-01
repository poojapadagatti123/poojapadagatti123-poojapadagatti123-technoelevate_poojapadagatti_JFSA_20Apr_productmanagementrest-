package com.te.productmanagementrest.DAO;

import com.te.productmanagementrest.beans.AdminBean;

public interface AdminDAO {
	
	public AdminBean authenticate(int id, String password);

}
