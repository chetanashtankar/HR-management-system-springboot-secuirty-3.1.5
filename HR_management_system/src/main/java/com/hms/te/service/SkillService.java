package com.hms.te.service;

import java.util.List;
import java.util.Optional;

import com.hms.te.entity.Skill;

public interface SkillService {
	List<Skill> getLeaveRequests();

	Optional<Skill> getLeaveRequest(String id);

}