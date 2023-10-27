package com.hms.te.controller;

import java.time.LocalDateTime;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.te.entity.PerformanceReview;
import com.hms.te.response.SuccessResponse;
import com.hms.te.service.PerformanceReviewService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/reviews")
@RequiredArgsConstructor
public class PerformanceReviewController {
	private final PerformanceReviewService performanceReviewService;

	@GetMapping("/")
	public ResponseEntity<SuccessResponse> getPerformanceReviews() {
		List<PerformanceReview> PerformanceReviews = performanceReviewService.getPerformanceReviews();
		return ResponseEntity.<SuccessResponse>ok().body(SuccessResponse.builder().data(PerformanceReviews)
				.message("data prvided").timesStamp(LocalDateTime.now()).build());
	}

	@GetMapping("/{id}")
	public ResponseEntity<SuccessResponse> getPerformanceReview(@PathVariable String id) {
		PerformanceReview PerformanceReview = performanceReviewService.getPerformanceReview(id)
				.orElseThrow(() -> new RuntimeException("employee not found...!!"));
		return ResponseEntity.<SuccessResponse>ok().body(SuccessResponse.builder().data(PerformanceReview)
				.message("data prvided").timesStamp(LocalDateTime.now()).build());
	}
}
