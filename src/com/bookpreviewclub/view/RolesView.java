package com.bookpreviewclub.view;

import com.bookpreviewclub.dto.RolesDTO;

public class RolesView {
	public void printRoleDetails(RolesDTO roles){

		System.out.println("UserRole ID = " + roles.getUserRoleID());
		System.out.println("User ID = " + roles.getUserID());
		System.out.println("Role ID = " + roles.getRoleID());
    
	}

}
