package com.hms.te.dto;

import java.time.LocalDate;
import java.util.List;

import com.hms.te.entity.LeaveRequest;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LeaveRequestDTO {

	@Id
	private int employeeLeaveRequestId;
	private LocalDate employeeStartDate;
	private LocalDate employeeEndDate;
	private String employeeLeaveType;

	private String password;
	
	@Enumerated(EnumType.STRING)
	private List<LeaveRequest> leaveRequests;

	private String employeeReason;

}
