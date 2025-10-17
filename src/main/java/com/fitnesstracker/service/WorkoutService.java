package com.fitnesstracker.service;

import com.fitnesstracker.model.ProgressLog;
import com.fitnesstracker.model.Workout;
import com.fitnesstracker.repository.ProgressLogRepository;
import com.fitnesstracker.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkoutService {
    private final WorkoutRepository workoutRepository;
    private final ProgressLogRepository progressLogRepository;
    @Autowired
    public WorkoutService(WorkoutRepository workoutRepository, ProgressLogRepository progressLogRepository) {
        this.workoutRepository = workoutRepository;
        this.progressLogRepository = progressLogRepository;
    }

    public ProgressLog logWorkout(Workout workout) {
        Workout savedWorkout = workoutRepository.save(workout);

        ProgressLog progressLog = new ProgressLog();
        progressLog.setExercise(savedWorkout.getExercise());
        progressLog.setSets(savedWorkout.getSets());
        progressLog.setReps(savedWorkout.getReps());
        progressLog.setTotalReps(savedWorkout.getSets() * savedWorkout.getReps());

        return progressLogRepository.save(progressLog);
    }
}
