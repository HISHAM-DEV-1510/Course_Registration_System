package com.example.CourseRegistrationSystem.service;

import com.example.CourseRegistrationSystem.model.CourseAvailability;
import com.example.CourseRegistrationSystem.model.courseRegistry;
import com.example.CourseRegistrationSystem.repository.courseRepo;
import com.example.CourseRegistrationSystem.repository.enrolledRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class courseService {

    @Autowired
    courseRepo repo;

    @Autowired
    enrolledRepo repository;

    public List<CourseAvailability> getcourseavailability() {
        return repo.findAll();
    }

    public List<courseRegistry> enrolledStudents() {
        return repository.findAll();
    }

    public void registerCourse(String name, String emailId, String courseName) {
        courseRegistry courseRegistry = new courseRegistry(name,emailId,courseName);
        repository.save(courseRegistry);
    }

    public void deleteenrolled(int id) {
        repository.deleteById(id);
    }
}
