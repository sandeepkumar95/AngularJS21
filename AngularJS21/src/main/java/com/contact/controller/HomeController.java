package com.contact.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.contact.domain.UserDetails;
import com.contact.service.UserService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/user")
public class HomeController {
	
	private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/profile", method = RequestMethod.POST)
	public void  home(@RequestBody String body) {
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			UserDetails userDetails = mapper.readValue(body, UserDetails.class);
			
			LOG.info(" First Name :" + userDetails.getFirstname());
			LOG.info(" Last Name :" + userDetails.getLastname());
			LOG.info(" Email :" + userDetails.getEmail());
			LOG.info(" Street :" + userDetails.getStreet());
			LOG.info(" city :" + userDetails.getCity());
			LOG.info(" zip :" + userDetails.getZip());
			
			userService.createUser(userDetails);
			
			
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
