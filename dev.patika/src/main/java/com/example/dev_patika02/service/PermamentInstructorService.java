package com.example.dev_patika02.service;


import com.example.dev_patika02.dao.abstracts.PermamentInstructorDAO;
import com.example.dev_patika02.model.PermanentInstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PermamentInstructorService implements BaseService<PermanentInstructor> {

    private PermamentInstructorDAO permamentInstructorDAO;

    @Autowired
    public PermamentInstructorService(PermamentInstructorDAO permamentInstructorDAO) {
        this.permamentInstructorDAO = permamentInstructorDAO;
    }

    @Override
    @Transactional
    public List<PermanentInstructor> findAll() {
        return permamentInstructorDAO.findAll();
    }

    @Override
    @Transactional
    public PermanentInstructor findById(int id) {

        return (PermanentInstructor) permamentInstructorDAO.findById(id);
    }

    @Override
    public PermanentInstructor save(PermanentInstructor object) {

        return (PermanentInstructor) permamentInstructorDAO.save(object);
    }

    @Override
    public void deleteById(int id) {
        permamentInstructorDAO.deleteById(id);
    }

    @Override
    public PermanentInstructor updateOnDatabase(PermanentInstructor object,int id) {
        return (PermanentInstructor) permamentInstructorDAO.updateOnDatabase(object, id);
    }
}

