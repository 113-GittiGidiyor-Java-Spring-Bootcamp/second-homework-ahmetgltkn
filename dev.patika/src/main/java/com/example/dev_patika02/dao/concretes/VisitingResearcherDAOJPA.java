package com.example.dev_patika02.dao.concretes;

import com.example.dev_patika02.dao.abstracts.VisitingResearcherDAO;
import com.example.dev_patika02.model.VisitingResearcher;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class VisitingResearcherDAOJPA implements VisitingResearcherDAO<VisitingResearcher> {

    EntityManager entityManager;

    public VisitingResearcherDAOJPA(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<VisitingResearcher> findAll() {

        return entityManager.createQuery("FROM  VisitingResearcher  ", VisitingResearcher.class).getResultList();

    }

    @Override
    public VisitingResearcher findById(int id) {

        return entityManager.find(VisitingResearcher.class,id);
    }

    @Override
    @Transactional
    public VisitingResearcher save(VisitingResearcher object) {

        return entityManager.merge(object);

    }

    @Override
    @Transactional
    public void deleteById(int id) {
        VisitingResearcher visitingResearcher = entityManager.createQuery("FROM VisitingResearcher v WHERE v.id=:id", VisitingResearcher.class).setParameter("id",id).getSingleResult();
        entityManager.remove(visitingResearcher);
    }

    @Override
    @Transactional
    public VisitingResearcher updateOnDatabase(VisitingResearcher visitingResearcher,int id) {
        VisitingResearcher foundVisiting = entityManager.find(VisitingResearcher.class, id);
        foundVisiting.setName(visitingResearcher.getName());
        foundVisiting.setAddress(visitingResearcher.getAddress());
        foundVisiting.setHourlySalary(visitingResearcher.getHourlySalary());
        foundVisiting.setPhoneNumber(visitingResearcher.getPhoneNumber());
        entityManager.merge(foundVisiting);
        return foundVisiting;
    }
}
