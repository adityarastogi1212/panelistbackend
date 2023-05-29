package com.lti.candidate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.candidate.model.Candidate;


public interface CandidateRepository extends JpaRepository<Candidate, Integer> {
	
	public Candidate findByCid(String cid);
	
	public List<Candidate> findByLevel(int level);
}