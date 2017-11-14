package com.je.demo.service;

import java.util.List;

import com.je.demo.entity.User;


public interface UserService {
	User findOneByUsername(String username);
	
	void changePassword(String newPassword);
	
	List<User> getAllUser();
}
