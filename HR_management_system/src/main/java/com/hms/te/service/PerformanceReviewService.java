package com.hms.te.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.te.entity.PerformanceReview;


public interface PerformanceReviewService{

	List<PerformanceReview> getPerformanceReviews();

	Optional<PerformanceReview> getPerformanceReview(String id);

}
