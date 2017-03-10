package com.contact.dao;

import org.springframework.data.repository.CrudRepository;

import com.contact.domain.Address;


public interface AddressDao extends CrudRepository<Address,Long>{

}
