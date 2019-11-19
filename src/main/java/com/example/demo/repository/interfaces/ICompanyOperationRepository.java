package com.example.demo.repository.interfaces;

import com.example.demo.model.CompanyOperation;

/**
 * ICompanyOperationRepository
 */
public interface ICompanyOperationRepository {
    CompanyOperation getCompanyOperation(String userId) throws Exception;
    int insertCompanyOperation(CompanyOperation companyOperation) throws Exception;
    int updateCompanyOperation(CompanyOperation companyOperation) throws Exception;
    int deleteCompanyOperation(CompanyOperation companyOperation) throws Exception;
}