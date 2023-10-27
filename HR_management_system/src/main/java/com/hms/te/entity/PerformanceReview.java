package com.hms.te.entity;

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
@ToString
@Table(name = "perfomance_tbl")
@Builder
@Entity
public class PerformanceReview {

	@Id
	private String employeeReviewId;
	private LocalDate employeeReviewDate;
	private String employeeReviewName;
	private String employeeReviewerComments;
	private double employeeRating;
	
	private String employeePassword;

}
