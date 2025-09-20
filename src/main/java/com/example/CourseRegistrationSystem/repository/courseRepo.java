package com.example.CourseRegistrationSystem.repository;

import com.example.CourseRegistrationSystem.model.CourseAvailability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courseRepo extends JpaRepository<CourseAvailability,String >{

}
