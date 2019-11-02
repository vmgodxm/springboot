package com.example.demo.repository.interfaces;

import java.util.List;

import com.example.demo.model.Admin;

public interface IAdminRepository {

	List<Admin> adminAll() throws Exception;

	Admin getAdminId (String adminUserId) throws Exception;

	int insertAdmin(Admin admin) throws Exception;


}