package com.example.task.controller;

import com.example.task.service.StudentProfileService;
import com.example.task.model.StudentProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentProfileController {
    private StudentProfileService studentProfileService;
    @Autowired
    public StudentProfileController(StudentProfileService studentProfileService) {
        this.studentProfileService = studentProfileService;
    }

    @PostMapping("/studentprofile/create")
    public String create(@RequestBody StudentProfile studentProfile) {
        studentProfileService.createStudentProfile(studentProfile);
        return "Student profile is successfully stored.";
    }
    @GetMapping("/studentprofile/{studentId}")
    public StudentProfile get(@PathVariable Long studentId) {
        return studentProfileService.getStudentProfileById(studentId);
    }
    @DeleteMapping("/studentprofile/{studentId}")
    public String delete(@PathVariable Long studentId) {
        return "Student profile is successfully deleted.";
    }
    @PutMapping("/studentprofile")
    public String update(@RequestBody StudentProfile studentProfile) {
        studentProfileService.updateStudentProfile(studentProfile);
        return "Student profile is successfully updated.";
    }
}
