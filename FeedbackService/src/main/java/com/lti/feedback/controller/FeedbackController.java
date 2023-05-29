package com.lti.feedback.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

import com.lti.feedback.model.Feedback;
import com.lti.feedback.repository.FeedbackRepository;

import java.util.List;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {
	
	@Autowired
    FeedbackRepository feedbackRepository;
	
	@Autowired
	private JavaMailSender javaMailSender;
	 
	@Value("${spring.mail.username}") 
	private String sender; 
    
    // get all feedbacks
    @GetMapping("/feedbacks")
    public List<Feedback> getFeedbacks() {
        return feedbackRepository.findAll();
    }

    // Save a feedback
    @PostMapping("/feedback")
    public Feedback newFeedback(@RequestBody Feedback feedback) {
    	
    	try {
			 
            // Creating a simple mail message
            SimpleMailMessage mailMessage = new SimpleMailMessage();
 
            // Setting up necessary details
            mailMessage.setFrom(sender);
            mailMessage.setTo("abhisharma13900@gmail.com");
            mailMessage.setText("Hi, \n" + "\nFYI, Feedback is submitted for the Interview. \n \n" + "Details given below:" + 
            "\nInterviewId: "+ feedback.getInterviewId() + "\nCandidateId: " + feedback.getCid() + "\nResult: " + feedback.getStatus()
            		+ "\n \n"+"Thanks & Regards,"+"\n"+"Talent Recruitment Team");
            mailMessage.setSubject("LTI Interview Scheduled");
 
            // Sending the mail
            javaMailSender.send(mailMessage);
        }
        catch (Exception e) {
            System.out.println("Mail Not Sent!");
        }
    	
        return feedbackRepository.save(feedback);
    }
}
