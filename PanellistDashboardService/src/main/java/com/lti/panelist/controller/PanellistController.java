package com.lti.panelist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.panelist.model.Panellist;
import com.lti.panelist.repository.PanellistRepository;

@RestController
@RequestMapping("/panelist")
public class PanellistController {
	@Autowired
	PanellistRepository panelRepo;
	
	@GetMapping(value = "/panelistDetails/{id}")
	public Panellist getPanelistDetails(@PathVariable String id) {
		return panelRepo.findByPid(id);
	}
	
	@GetMapping(value = "/eligiblePanelist")
	public List<Panellist> getEligiblePanelist(){
		return panelRepo.findAll();
	}
}
