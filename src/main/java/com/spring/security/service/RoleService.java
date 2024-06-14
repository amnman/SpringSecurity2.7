package com.spring.security.service;

import java.util.List;

import com.spring.security.model.RoleModel;

public interface RoleService {
	
	public RoleModel createRole(RoleModel roleModel);
	public List<RoleModel> getAllRoles();
	public RoleModel getRoleByID(long id);
	public void deleteRoleByID(long id);
}
