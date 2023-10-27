package com.hms.te.dto;

import java.time.LocalDate;

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
public class PerfomanceReviewDTO {

	@Id
	private int employeeReviewId;
	private LocalDate employeeReviewDate;
	private String employeeReviewName;
	private String employeeReviewerComments;
	private double employeeRating;
	private String password;
}
