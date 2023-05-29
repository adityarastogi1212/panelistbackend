package com.lti.panelist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.panelist.model.Panellist;



public interface PanellistRepository extends JpaRepository<Panellist,Integer> {

	public Panellist findByPid(String pid);
}
