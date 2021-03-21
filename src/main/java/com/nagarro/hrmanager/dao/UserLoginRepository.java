package com.nagarro.hrmanager.dao;

import org.springframework.data.repository.CrudRepository;

import com.nagarro.hrmanager.entity.Login;

/**
 * 
 * @author ahiniroy
 *
 *this is a interface of the UserLoginRepository extends to the  CrudRepository
 */
public interface UserLoginRepository extends CrudRepository<Login, Integer> {

}
