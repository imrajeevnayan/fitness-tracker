package com.fitnesstracker.controller;

import com.fitnesstracker.model.ProgressLog;
import com.fitnesstracker.model.Workout;
import com.fitnesstracker.repository.WorkoutRepository;
import com.fitnesstracker.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080") // or "*" for all origins
@RequestMapping("/api/workouts")
public class WorkoutController {

    private final WorkoutService workoutService;

    @Autowired
    public WorkoutController(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    @PostMapping("/log")
    public ProgressLog logWorkout(@RequestBody Workout workout) {

        return workoutService.logWorkout(workout);
    }

}


