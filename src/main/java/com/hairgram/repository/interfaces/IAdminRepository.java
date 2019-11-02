package com.hairgram.repository.interfaces;

import java.util.List;

import com.hairgram.model.Admin;

public interface IAdminRepository {

	List<Admin> adminAll() throws Exception;

	Admin getAdminId (String adminUserId) throws Exception;

	int insertAdmin(Admin admin) throws Exception;


}