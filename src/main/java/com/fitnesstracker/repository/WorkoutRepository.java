package com.fitnesstracker.repository;

import com.fitnesstracker.model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepository extends JpaRepository<Workout,Long> {
}
