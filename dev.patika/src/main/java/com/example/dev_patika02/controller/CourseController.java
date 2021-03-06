package com.example.dev_patika02.controller;


import com.example.dev_patika02.model.Course;
import com.example.dev_patika02.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CourseController {
    private CourseService courseService;

    public CourseController(CourseService courseService) {

        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public ResponseEntity<List<Course>> findAll(){

        return new ResponseEntity<>(courseService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/courses/{id}")
    public Course findCourseById(@PathVariable int id){

        return  courseService.findById(id);
    }


    @PostMapping("/courses")
    public Course saveCourses(@RequestBody Course course){

        return courseService.save(course);
    }

    @DeleteMapping(value = "/courses/{id}")
    public void deleteCourseById(@PathVariable int id){

        courseService.deleteById(id);
    }


    @PutMapping("/courses/{id}")
    public Course updateCourse(@RequestBody Course course, @PathVariable int id){
        return   courseService.updateOnDatabase(course,id);
    }


}
