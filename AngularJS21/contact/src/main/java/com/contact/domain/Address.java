package com.contact.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "addressid")
	private Long addressid;
	
	@Column(name = "userid", nullable = false, unique = false)
	private Long userid;
	
    @Column(name = "street", nullable = false, unique = false)
    private String street;
    
    @Column(name = "city", nullable = false, unique = false)
    private String city;
    
    @Column(name = "zip", nullable = false, unique = false)
    private String zip;

	public Long getAddressid() {
		return addressid;
	}

	public void setAddressid(Long addressid) {
		this.addressid = addressid;
	}

	public Long getUserid() {
		return userid;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getZip() {
		return zip;
	}

	public Address(Long userid, String street, String city, String zip) {
		super();
		this.userid = userid;
		this.street = street;
		this.city = city;
		this.zip = zip;
	}
	
    
    
    
}
