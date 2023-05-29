package com.lti.feedback.model;
import javax.persistence.*;

@Entity
@SequenceGenerator(name="seq_genf", sequenceName = "seq_genf", initialValue = 501, allocationSize = 1)
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq_genf")
    private long id;
    private String status;
    private int rating;
    private String comment;
    private int interviewId;
    private String cid;
    
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getInterviewId() {
		return interviewId;
	}
	public void setInterviewId(int interviewId) {
		this.interviewId = interviewId;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Feedback(String status, int rating, String comment, int interviewId, String cid, String pid) {
		super();
		this.status = status;
		this.rating = rating;
		this.comment = comment;
		this.interviewId = interviewId;
		this.cid = cid;
	}
}