package com.bookpreviewclub.controller;

import com.bookpreviewclub.dto.RolesDTO;
import com.bookpreviewclub.service.RolesService;
import com.bookpreviewclub.view.RolesView;


public class RoleController { 
	private RolesDTO model;
	private RolesView view;

	public RoleController(RolesDTO model, RolesView view){
		this.model = model;
		this.view = view;
	}
	
	public void updateView(){
		//where?
		view.printRoleDetails(model);
		
	}
	
	public void getRoles(){
		RolesService service = new RolesService();
		RolesDTO roles = service.getRoles();
		RolesView view = new RolesView();
		view.printRoleDetails(roles);
		
	}
	

	
}

