package com.example.CourseRegistrationSystem.repository;

import com.example.CourseRegistrationSystem.model.courseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface enrolledRepo extends JpaRepository<courseRegistry,Integer> {
}
