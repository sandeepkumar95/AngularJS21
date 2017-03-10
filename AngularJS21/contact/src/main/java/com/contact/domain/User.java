package com.contact.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userid")
	private Long userid;
	
    @Column(name = "fname", nullable = false, unique = false)
    private String fname;
    @Column(name = "lname", nullable = false, unique = false)
    private String lname;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    
	public User(String fname, String lname, String email) {
		super();	
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public String getEmail() {
		return email;
	}
}
