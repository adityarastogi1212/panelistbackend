package com.lti.interview.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.interview.model.InterviewDetails;


public interface InterviewDetailsRepository extends JpaRepository<InterviewDetails, String> {

	List<InterviewDetails> findByCid(String cid);
	List<InterviewDetails> findByPidAndStatus(String pid, int status);
	List<InterviewDetails> findByCidAndStatus(String cid, int status);
	InterviewDetails findByInterviewId(int interviewId);
	
}

