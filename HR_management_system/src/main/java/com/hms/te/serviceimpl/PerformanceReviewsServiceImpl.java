package com.hms.te.serviceimpl;

import java.util.List;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hms.te.entity.PerformanceReview;
import com.hms.te.repository.PerfomanaceReviewRepository;
import com.hms.te.service.PerformanceReviewService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PerformanceReviewsServiceImpl implements PerformanceReviewService{

	private final PerfomanaceReviewRepository performanceReviewsRepository; 
	@Override
	public List<PerformanceReview> getPerformanceReviews() {
		return performanceReviewsRepository.findAll();
	}
	
	@Override
	public Optional<PerformanceReview> getPerformanceReview(String id) {
		return performanceReviewsRepository.findById(id);
	}

}

