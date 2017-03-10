package com.contact.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.contact.dao.AddressDao;
import com.contact.dao.UserDao;
import com.contact.domain.Address;
import com.contact.domain.User;
import com.contact.domain.UserDetails;



@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	private static final Logger LOG = LoggerFactory.getLogger(UserService.class);
	
    @Autowired
    private UserDao userDao;
    
    @Autowired
    private AddressDao addressrDao;

	@Override
	public void createUser(UserDetails userDetail) {
		User user = new User(userDetail.getFirstname(),userDetail.getLastname(),userDetail.getEmail());
        user=userDao.save(user);
        LOG.info("User Id: " + user.getUserid());
        Address addr = new Address(user.getUserid(),userDetail.getStreet(),userDetail.getCity(),userDetail.getZip());        
        addr = addressrDao.save(addr);
        LOG.info("Address Id: " +addr.getAddressid());
	}
}
