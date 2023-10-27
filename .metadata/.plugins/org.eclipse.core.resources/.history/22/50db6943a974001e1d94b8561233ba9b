package com.hms.te.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hms.te.entity.LeaveRequest;
import com.hms.te.repository.LeaveRequestRepository;
import com.hms.te.service.LeaveRequestService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LeaveRequestServiceImpl implements LeaveRequestService {

	private final LeaveRequestRepository leaveRequestRepository;

	@Override
	public List<LeaveRequest> getLeaveRequests() {
		List<LeaveRequest> leaveRequests = leaveRequestRepository.findAll();
		return leaveRequests;
	}

	@Override
	public Optional<LeaveRequest> getLeaveRequest(Integer id) {
		Optional<LeaveRequest> IdOp = leaveRequestRepository.findById(id);
		return IdOp;
	}

}
