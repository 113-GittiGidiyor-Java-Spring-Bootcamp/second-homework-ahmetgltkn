package com.example.dev_patika02.service;

import com.example.dev_patika02.dao.abstracts.CourseDAO;
import com.example.dev_patika02.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CourseService implements BaseService<Course>{
    private CourseDAO courseDAO;

    @Autowired
    public CourseService(CourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }

    @Override
    public List<Course> findAll() {
        return courseDAO.findAll();
    }

    @Override
    public Course findById(int id) {
        return (Course) courseDAO.findById(id);
    }

    @Override
    @Transactional
    public Course save(Course course) {
        return (Course) courseDAO.save(course);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        courseDAO.deleteById(id);
    }

    @Override
    @Transactional
    public Course updateOnDatabase(Course course,int id) {
        return (Course) courseDAO.updateOnDatabase(course,id);
    }
}
