package com.lti.interview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.lti.interview.model.InterviewDetails;
import com.lti.interview.repository.InterviewDetailsRepository;

@Service
public class InterviewDetailsService {
	
	@Autowired
	InterviewDetailsRepository repo;
	
	 @Autowired
	 private JavaMailSender javaMailSender;
	 
	 @Value("${spring.mail.username}") 
	 private String sender; 
	
	 
	public void cmail(String name, String email, String cid, String pswd) {
		
		try {
			 
            // Creating a simple mail message
            SimpleMailMessage mailMessage = new SimpleMailMessage();
 
            // Setting up necessary details
            mailMessage.setFrom(sender);
            mailMessage.setTo(email);
            mailMessage.setText("Dear " + name + ", \n" + "\nYour Interview has been scheduled on Talent Recruitment App. \n "+
            		"\n"+"Login Credentials - " + "\n"+"Username: "+ cid + "\n"+"Password: "+ pswd + "\n"+"Link - "+"http://localhost:4200/login" 
            		+ "\n \n"+"Thanks & Regards,"+"\n"+"Talent Recruitment Team");
            mailMessage.setSubject("LTI Interview Scheduled");
 
            // Sending the mail
            javaMailSender.send(mailMessage);
        }
        catch (Exception e) {
            System.out.println("Mail Not Sent!");
        }
		
	}
	
	public void pmail(String name, String email, String pid, String pswd) {
		
		try {
			 
            // Creating a simple mail message
            SimpleMailMessage mailMessage = new SimpleMailMessage();
 
            // Setting up necessary details
            mailMessage.setFrom(sender);
            mailMessage.setTo(email);
            mailMessage.setText("Dear "+ name +",\n"+"\nInterview has been scheduled on Talent Recruitment App. \n "+
            		"\n"+"Login Credentials - " + "\n"+"Username: " + pid + "\n"+"Password: " + pswd + "\n"+"Link - "+"http://localhost:4200/login" 
            		+ "\n \n"+"Thanks & Regards,"+"\n"+"Talent Recruitment Team");
            mailMessage.setSubject("LTI Interview Scheduled");
 
            // Sending the mail
            javaMailSender.send(mailMessage);
        }
        catch (Exception e) {
            System.out.println("Mail Not Sent!");
        }
		
	}
	 
	public void setInterview(InterviewDetails id) {
		repo.save(id);
		if(id.getStatus()==0)
		{
			cmail(id.getCname(), id.getCemail(), id.getCid(), id.getCpswd());
			pmail(id.getPname(), id.getPemail(), id.getPid(), id.getPswd());
		}
	}
	
	public void updateInterview(InterviewDetails id) {
		repo.save(id);
	}

	public List<InterviewDetails> getInterview(){
		return repo.findAll();
	}

	public List<InterviewDetails> getInterviewByCid(String cid) {
		return repo.findByCidAndStatus(cid, 0);
	}
	
	public List<InterviewDetails> getPendingInterviewByPid(String pid) {
		return repo.findByPidAndStatus(pid, 0);
	}
	
	public InterviewDetails getInterviewById(int id) {
		return repo.findByInterviewId(id);
	}
}
