package com.je.demo.api.user.service;

import java.util.List;

import com.je.demo.api.user.entity.User;


public interface UserService {
	User findOneByUsername(String username);
	
	void changePassword(String newPassword);
	
	List<User> getAllUser();
}
