package com.hms.te.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hms.te.entity.TrainingProgram;
import com.hms.te.repository.TrainingProgramRepository;
import com.hms.te.service.TrainingProgramService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TrainingProgramServiceImpl implements TrainingProgramService {

	private final TrainingProgramRepository trainingProgramRepository;

	@Override
	public List<TrainingProgram> getTrainingPrograms() {

		return trainingProgramRepository.findAll();
	}

	@Override
	public Optional<TrainingProgram> getTrainingProgram(String id) {
		return trainingProgramRepository.findById(id);
	}

}
