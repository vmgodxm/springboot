package com.example.demo.repository;

import com.example.demo.model.CompanyOperation;
import com.example.demo.repository.interfaces.ICompanyOperationRepository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyOperationRepository implements ICompanyOperationRepository {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public CompanyOperation getCompanyOperation(final String userId) throws Exception {
        return sqlSession.selectOne("mapper.CompanyOperationMapper.getCompanyOperation", userId);
    }

    @Override
    public int insertCompanyOperation(final CompanyOperation companyOperation) throws Exception {
        return sqlSession.insert("mapper.CompanyOperationMapper.insertCompanyOperation", companyOperation);
    }

    @Override
    public int updateCompanyOperation(CompanyOperation companyOperation) throws Exception {
        return sqlSession.insert("mapper.CompanyOperationMapper.updateCompanyOperation", companyOperation);
    }
}