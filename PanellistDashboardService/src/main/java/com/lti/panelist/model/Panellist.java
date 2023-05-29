package com.lti.panelist.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Panellist {
	
	@Id
    private String pid;
    private String name;
    private String grade;
    private String email;
    private String password;
    private String contact;
    private String designation;
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Panellist() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Panellist(String name, String grade, String email, String password, String contact, String designation) {
		super();
		this.name = name;
		this.grade = grade;
		this.email = email;
		this.password = password;
		this.contact = contact;
		this.designation = designation;
	}
	
}
