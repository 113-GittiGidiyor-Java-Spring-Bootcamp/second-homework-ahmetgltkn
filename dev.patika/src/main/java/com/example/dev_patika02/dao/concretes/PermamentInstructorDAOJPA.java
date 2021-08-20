package com.example.dev_patika02.dao.concretes;

import com.example.dev_patika02.dao.abstracts.PermamentInstructorDAO;
import com.example.dev_patika02.model.PermanentInstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class PermamentInstructorDAOJPA implements PermamentInstructorDAO<PermanentInstructor> {

    EntityManager entityManager;

    public PermamentInstructorDAOJPA(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<PermanentInstructor> findAll() {

        return entityManager.createQuery("FROM  PermanentInstructor  ",PermanentInstructor.class).getResultList();
    }

    @Override
    @Transactional

    public PermanentInstructor findById(int id) {

        return entityManager.find(PermanentInstructor.class,id);
    }

    @Override
    @Transactional
    public PermanentInstructor save(PermanentInstructor object) {

        return entityManager.merge(object);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        PermanentInstructor permanentInstructor = entityManager.createQuery("FROM PermanentInstructor p WHERE p.id=:id", PermanentInstructor.class).setParameter("id",id).getSingleResult();
        entityManager.remove(permanentInstructor);
    }

    @Override
    @Transactional
    public PermanentInstructor updateOnDatabase(PermanentInstructor permanentInstructor,int id) {

        PermanentInstructor foundPermament = entityManager.find(PermanentInstructor.class, id);
        foundPermament.setName(permanentInstructor.getName());
        foundPermament.setAddress(permanentInstructor.getAddress());
        foundPermament.setFixedSalary(permanentInstructor.getFixedSalary());
        foundPermament.setPhoneNumber(permanentInstructor.getPhoneNumber());
        entityManager.merge(foundPermament);
        return foundPermament;

    }
}
