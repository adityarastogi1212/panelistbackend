package com.lti.candidate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lti.candidate.model.Candidate;
import com.lti.candidate.repository.CandidateRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/candidate")
public class Controller {
	
	@Autowired
	CandidateRepository candidateRepository;
	
	@GetMapping(value = "/candidateDetails/{id}")
	public Candidate getCandidateDetails(@PathVariable String id) {
		return candidateRepository.findByCid(id);
	}
	
	@GetMapping(value = "/eligibleCandidates/{level}")
	public List<Candidate> getEligibleCandidate(@PathVariable int level){
		return candidateRepository.findByLevel(level);
	}
	
	
	@PutMapping("/updateCandidate/{id}")
	public Candidate updateCandidate(@PathVariable("id") String id, @RequestBody Candidate candidate) {
      // get candidate by id
		Candidate candidateObj = candidateRepository.findByCid(id);
		
		candidateObj.setLevel(candidateObj.getLevel()+1);
		
		return candidateRepository.save(candidateObj);
	}
	
	@GetMapping(value = "/allCandidates")
	public List<Candidate> getAllCandidates(){
		return candidateRepository.findAll();
	}
}
