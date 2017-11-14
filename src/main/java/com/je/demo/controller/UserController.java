package com.je.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.je.demo.entity.User;
import com.je.demo.service.UserService;



@RestController
@RequestMapping(value = "/api")
public class UserController {

	private final Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	/**
	 * GET /users -> get all the users
	 */
	@RequestMapping(value = "/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getAll() {
		log.debug("REST request to get all Users");
		String username = "eric4";
		User u = userService.findOneByUsername(username );
		return new ResponseEntity<>(u, HttpStatus.OK);
	}

}
