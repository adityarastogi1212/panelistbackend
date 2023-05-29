package com.lti.interview.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="id2")
public class InterviewDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int interviewId;
	private String interviewTitle;
	private int level;
	private String cid;
	private String pid;
	private LocalDateTime dateTimeOfInterview;
	private String jobRole;
	private int status;
	private String interviewLink;
	// For Mail
	private String cemail;
	private String cname;
	private String cpswd;
	private String pemail;
	private String pname;
	private String pswd;
	
	
	public int getInterviewId() {
		return interviewId;
	}
	public void setInterviewId(int interviewId) {
		this.interviewId = interviewId;
	}
	public String getInterviewTitle() {
		return interviewTitle;
	}
	public void setInterviewTitle(String interviewTitle) {
		this.interviewTitle = interviewTitle;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public LocalDateTime getDateTimeOfInterview() {
		return dateTimeOfInterview;
	}
	public void setDateTimeOfInterview(LocalDateTime dateTimeOfInterview) {
		this.dateTimeOfInterview = dateTimeOfInterview;
	}
	public String getJobRole() {
		return jobRole;
	}
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getInterviewLink() {
		return interviewLink;
	}
	public void setInterviewLink(String interviewLink) {
		this.interviewLink = interviewLink;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCpswd() {
		return cpswd;
	}
	public void setCpswd(String cpswd) {
		this.cpswd = cpswd;
	}
	public String getPemail() {
		return pemail;
	}
	public void setPemail(String pemail) {
		this.pemail = pemail;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public InterviewDetails(String interviewTitle, int level, String cid, String pid, LocalDateTime dateTimeOfInterview,
			String jobRole, int status, String interviewLink, String cemail, String cname, String cpswd, String pemail,
			String pname, String pswd) {
		super();
		this.interviewTitle = interviewTitle;
		this.level = level;
		this.cid = cid;
		this.pid = pid;
		this.dateTimeOfInterview = dateTimeOfInterview;
		this.jobRole = jobRole;
		this.status = status;
		this.interviewLink = interviewLink;
		this.cemail = cemail;
		this.cname = cname;
		this.cpswd = cpswd;
		this.pemail = pemail;
		this.pname = pname;
		this.pswd = pswd;
	}
	public InterviewDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
