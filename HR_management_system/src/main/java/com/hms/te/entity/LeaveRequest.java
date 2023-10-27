package com.hms.te.entity;

import java.time.LocalDate;
import java.util.List;

import com.hms.te.enums.LeaveStatusEnums;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "leaverequest_tbl")
@Builder
@Entity
public class LeaveRequest {

	@Id
	private int employeeLeaveRequestId;
	private LocalDate employeeStartDate;
	private LocalDate employeeEndDate;
	private String employeeLeaveType;
	private String employeePassword;

	@Enumerated(EnumType.STRING)
	private List<LeaveStatusEnums> leaveStatusEnums;

	private String employeeReason;

}
