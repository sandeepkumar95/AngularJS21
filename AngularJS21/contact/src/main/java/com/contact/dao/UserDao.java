package com.contact.dao;

import org.springframework.data.repository.CrudRepository;

import com.contact.domain.User;



public interface UserDao extends CrudRepository<User,Long>{

	//User findByEmailId(String emailId);
}



