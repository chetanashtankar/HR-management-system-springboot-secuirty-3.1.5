package com.hms.te.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hms.te.entity.Skill;
import com.hms.te.repository.SkillRepository;
import com.hms.te.service.SkillService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SkillServiceImpl implements SkillService {

	private SkillRepository skillRepository;

	@Override
	public List<Skill> getLeaveRequests() {
		return null;
	}

	@Override
	public Optional<Skill> getLeaveRequest(String id) {
		return skillRepository.findById(id);
	}

}