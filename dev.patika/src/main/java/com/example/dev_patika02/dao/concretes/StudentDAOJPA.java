package com.example.dev_patika02.dao.concretes;

import com.example.dev_patika02.dao.abstracts.StudentDAO;
import com.example.dev_patika02.model.Student;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class StudentDAOJPA implements StudentDAO<Student> {

    private EntityManager entityManager;


    public StudentDAOJPA(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Student> findAll() {
        return entityManager.createQuery("FROM  Student s ",Student.class).getResultList();
    }

    @Override
    @Transactional
    public Student findById(int id) {
        return entityManager.find(Student.class,id);
    }

    @Override
    @Transactional
    public Student save(Student student) {
        return entityManager.merge(student);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Student student = entityManager.createQuery("FROM Student s WHERE s.id=:id", Student.class).setParameter("id",id).getSingleResult();
        entityManager.remove(student);
    }

    @Override
    @Transactional
    public Student updateOnDatabase(Student student,int id) {

        Student foundStudent = entityManager.find(Student.class, id);
        foundStudent.setName(student.getName());
        foundStudent.setAddress(student.getAddress());
        foundStudent.setBirthDate(student.getBirthDate());
        foundStudent.setGender(student.getGender());
        entityManager.merge(foundStudent);
        return foundStudent;

    }
}
