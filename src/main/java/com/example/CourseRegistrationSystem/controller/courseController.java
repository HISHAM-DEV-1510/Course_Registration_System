package com.example.CourseRegistrationSystem.controller;

import com.example.CourseRegistrationSystem.model.CourseAvailability;
import com.example.CourseRegistrationSystem.model.courseRegistry;
import com.example.CourseRegistrationSystem.service.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:5500")
public class courseController {

    @Autowired
    courseService service;

    @GetMapping("/courses")
    public List<CourseAvailability> getcourseavailability(){
        return service.getcourseavailability();
    }

    @GetMapping("/courses/enrolled")
    public List<courseRegistry> enrolledStudents(){
        return service.enrolledStudents();
    }

    @PostMapping("/courses/register")
    public String registerCourse(@RequestParam("name") String name,
                                 @RequestParam("emailId") String emailId,
                                 @RequestParam("courseName") String courseName){
      //  System.out.println("name= "+ name + "emailId= "+emailId+ "courseName= "+courseName);
        service.registerCourse(name,emailId,courseName);
        return "Congratulation! "+name+" Enrollment Successful for "+courseName;
    }

    @DeleteMapping("/courses/delete/{id}")
    public String deleteenrolled(@PathVariable("id") int id){
        service.deleteenrolled(id);
        return "Deleted Successfully";
    }
}
