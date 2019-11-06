package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Admin;
import com.example.demo.repository.interfaces.IAdminRepository;

@Repository
public class AdminRepository implements IAdminRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<Admin> adminAll() throws Exception{
		return sqlSession.selectList("mapper.AdminMapper.adminAll");
	}
	
	@Override
	public Admin getAdminId (String adminUserId) throws Exception {
		return sqlSession.selectOne("mapper.AdminMapper.getAdminId", adminUserId);
	}
	
	@Override
	public int insertAdmin(Admin admin) throws Exception{
		return sqlSession.insert("mapper.AdminMapper.insertAdmin", admin);
	}
	
	@Override
	public int deleteAdmin(String adminUserId) throws Exception{
		return sqlSession.delete("mapper.AdminMapper.delectAdmin", adminUserId);
	}
	
	@Override
	public int updateAdmin(Admin admin) throws Exception {
	   return sqlSession.insert("mapper.AdminMapper.updateAdmin", admin);
    }


	@Override
	public int loginAdmin(Admin admin) throws Exception {

		return sqlSession.selectOne("mapper.AdminMapper.loginAdmin", admin);
	}
}