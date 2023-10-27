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
public class SkillDTO {

	@Id
	private int employeeSkillId;
	private String employeeSkillName;
	private String employeeSkillDescription;
	private String password;
}
