package com.example.demo.controller;

import com.example.demo.model.CompanyOperation;
import com.example.demo.repository.interfaces.ICompanyOperationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CompanyOperationController
 */
@RestController
public class CompanyOperationController {

    @Autowired
    private ICompanyOperationRepository repository;

    @GetMapping(path = "/companyOperation/{userId}")
    public ResponseEntity<CompanyOperation> getCompanyOperation(@PathVariable String userId) throws Exception {
        ResponseEntity<CompanyOperation> retVal = null;

        if (userId == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        try {   
            CompanyOperation result = repository.getCompanyOperation(userId);
            retVal = new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            retVal = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return retVal;
    }

    @PostMapping(path = "/companyOperation")
    public ResponseEntity<Integer> insertCompanyOperation(HttpEntity<CompanyOperation> httpEntity) throws Exception {
        ResponseEntity<Integer> retVal = null;

        CompanyOperation body = httpEntity.getBody();
        if (body == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        try {   
            Integer result = repository.insertCompanyOperation(body);
            retVal = new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            retVal = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return retVal;
    }

    @PutMapping(path = "/companyOperation")
    public ResponseEntity<Integer> updateCompanyOperation(HttpEntity<CompanyOperation> httpEntity) throws Exception {
        ResponseEntity<Integer> retVal = null;
        
        CompanyOperation body = httpEntity.getBody();
        if (body == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        try {   
            Integer result = repository.updateCompanyOperation(body);
            retVal = new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            retVal = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return retVal;
    }
}