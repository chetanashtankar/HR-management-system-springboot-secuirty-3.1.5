package com.hms.te.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.te.entity.Skill;
import com.hms.te.response.SuccessResponse;
import com.hms.te.service.SkillService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/skills")
@RequiredArgsConstructor
public class SkillController {

	private final SkillService skillService;

	@GetMapping("/")
	public ResponseEntity<SuccessResponse> getLeaveRequests() {
		List<Skill> leaveRequests = skillService.getLeaveRequests();
		return ResponseEntity.<SuccessResponse>ok()
				.body(SuccessResponse.builder().data(leaveRequests).message("leave requests provided").build());
	}

	@GetMapping("/{id}`")
	public ResponseEntity<SuccessResponse> getLeaveRequest(@PathVariable String id) {
		Skill leaveRequest = skillService.getLeaveRequest(id)
				.orElseThrow(() -> new RuntimeException("leaveRequest notfound...!!"));
		return ResponseEntity
				.<SuccessResponse>ok(SuccessResponse.builder().data(leaveRequest).message("data provided").build());
	}
}
