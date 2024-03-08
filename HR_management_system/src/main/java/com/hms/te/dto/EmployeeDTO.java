package com.hms.te.dto;

import java.time.LocalDate;

import jakarta.persistence.Entity;
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
@Builder
public class EmployeeDTO {

	
	private String employeeId;
	private String employeeFirstName;
	private String employeeLastName;
	private String employeeEmailis;
	private long employeeContactNumber;
	private String employeeDepartment;
	private String employeeDesignation;
	private String password;
	private LocalDate employeeJoiningDate;

}
