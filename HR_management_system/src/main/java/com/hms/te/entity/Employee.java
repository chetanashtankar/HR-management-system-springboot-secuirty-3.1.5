package com.hms.te.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
@Table(name = "employee_tbl")
@Builder
@Entity
public class Employee {

	@Id
	private String employeeId;
	private String employeeFirstName;
	private String employeeLastName;
	private String employeeEmailId;
	private long employeeContactNumber;
	private String employeeDepartment;
	private String employeeDesignation;
	private LocalDate employeeJoiningDate;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "employees")
	private List<Skill> skills;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "employees")
	private List<TrainingProgram> trainingPrograms;

}
