package com.lti.candidate.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Candidate {

    @Id
    private String cid;
    private String name;
    private String email;
    private String password;
    private String resume;
    private long contact;
    private Integer level;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Candidate(String name, String email, String password, String resume, Long contact, Integer level) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.resume = resume;
		this.contact = contact;
		this.level = level;
	}
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}