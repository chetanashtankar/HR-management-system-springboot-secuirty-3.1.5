package com.hms.te.entity;

import java.time.LocalDate;
import java.util.ArrayList;
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
@Table(name = "training_tbl")
@ToString
@Builder
@Entity
public class TrainingProgram {

	@Id
	private String employeeProgramId;
	private String employeeProgramName;
	private String employeeProgramDescription;
	private int employeeStartDate;
	private int employeeEndDate;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Employee> employees;

}
