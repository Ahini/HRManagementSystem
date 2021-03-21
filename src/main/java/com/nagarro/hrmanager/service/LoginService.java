package com.nagarro.hrmanager.service;

import org.springframework.stereotype.Service;

/**
 * 
 * @author ahiniroy
 *
 *this is a interface of the LoginServiceImplementation
 */
@Service
public interface LoginService {
	
	/**
	 * passing the method checkLogin form the LoginServiceImplementation
	 */
	public boolean checkLogin(int userId, String userPassword);

}
