package com.lti.feedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.feedback.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
