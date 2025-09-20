package com.example.CourseRegistrationSystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.stereotype.Component;

@Data
@Entity
@Table(name = "course_registry")
@AllArgsConstructor
public class courseRegistry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String emailId;
    private String courseName;

    public courseRegistry(String name, String emailId, String courseName) {
        this.name = name;
        this.emailId = emailId;
        this.courseName = courseName;
    }

    public courseRegistry() {
    }
}
