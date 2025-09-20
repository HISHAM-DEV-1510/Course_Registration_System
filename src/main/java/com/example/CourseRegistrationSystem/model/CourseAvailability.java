package com.example.CourseRegistrationSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class CourseAvailability {

    @Id
    private String courseId;
    private String courseName;
    private int durationInWeeks;
    private String Trainer;
}
