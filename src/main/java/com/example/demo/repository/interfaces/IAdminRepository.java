package com.example.demo.repository.interfaces;

import java.util.List;

import com.example.demo.model.Admin;

public interface IAdminRepository {

	int loginAdmin(Admin admin) throws Exception;	
	
	List<Admin> adminAll() throws Exception;

	Admin getAdminId (String adminUserId) throws Exception;

	int insertAdmin(Admin admin) throws Exception;
	
	int deleteAdmin(String adminUserId) throws Exception;

	int updateAdmin(Admin admin) throws Exception;


}