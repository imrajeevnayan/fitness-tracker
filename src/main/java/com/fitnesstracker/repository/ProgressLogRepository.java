package com.fitnesstracker.repository;

import com.fitnesstracker.model.ProgressLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgressLogRepository extends JpaRepository<ProgressLog,Long> {
}
