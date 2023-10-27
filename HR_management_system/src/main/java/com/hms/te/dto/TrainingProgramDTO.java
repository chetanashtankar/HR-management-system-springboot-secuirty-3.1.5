package com.hms.te.dto;

import jakarta.persistence.Entity;
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
public class TrainingProgramDTO {

	@Id
	private int employeeProgramId;
	private String employeeProgramDescription;
	private int employeeStartDate;
	private int employeeEndDate;
	private String password;
}
