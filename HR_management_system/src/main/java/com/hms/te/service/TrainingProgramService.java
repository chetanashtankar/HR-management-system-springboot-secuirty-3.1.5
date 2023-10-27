package com.hms.te.service;

import java.util.List;
import java.util.Optional;

import com.hms.te.entity.TrainingProgram;


public interface TrainingProgramService {
	List<TrainingProgram> getTrainingPrograms();

	Optional<TrainingProgram> getTrainingProgram(String id);

}
