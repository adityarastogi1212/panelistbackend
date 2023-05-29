package com.lti.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;

import com.lti.interview.model.InterviewDetails;
import com.lti.interview.service.InterviewDetailsService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/interview")
public class InterviewDetailsController {
	
	@Autowired
	InterviewDetailsService srvc;
	
	@PostMapping("/details")
	public void setInterview(@RequestBody InterviewDetails id) {
		srvc.setInterview(id);
	}
	
	@GetMapping("/data")
	public List<InterviewDetails> getInterview() {
		return srvc.getInterview();
	}
	
	@GetMapping("/interviewForCandidate/{cid}")
	public List<InterviewDetails> getInterviewByCid(@PathVariable String cid) {
		return srvc.getInterviewByCid(cid);
	}
	
	@GetMapping("/interviewForPanelist/{pid}")
	public List<InterviewDetails> getPendingInterviewByPid(@PathVariable String pid) {
		return srvc.getPendingInterviewByPid(pid);
	}
	
	@GetMapping("/interviewForFeedback/{id}")
	public InterviewDetails getInterviewByPid(@PathVariable int id) {
		return srvc.getInterviewById(id);
	}
	
	@PutMapping("/updateInterview")
	public void updateInterview(@RequestBody int id) {
		
		InterviewDetails intDetail = srvc.getInterviewById(id);
		intDetail.setStatus(1);
		
		srvc.updateInterview(intDetail);
	}
}
