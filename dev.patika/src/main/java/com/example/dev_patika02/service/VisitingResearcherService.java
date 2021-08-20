package com.example.dev_patika02.service;


import com.example.dev_patika02.dao.abstracts.VisitingResearcherDAO;
import com.example.dev_patika02.model.VisitingResearcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitingResearcherService implements BaseService<VisitingResearcher> {

    //**
    private VisitingResearcherDAO visitingResearcherDAO;

    public VisitingResearcherService(VisitingResearcherDAO visitingResearcherDAO) {
        this.visitingResearcherDAO = visitingResearcherDAO;
    }

    @Override
    public List<VisitingResearcher> findAll() {
        return visitingResearcherDAO.findAll();
    }

    @Override
    public VisitingResearcher findById(int id) {
        return (VisitingResearcher) visitingResearcherDAO.findById(id);
    }

    @Override
    public VisitingResearcher save(VisitingResearcher object) {
        return (VisitingResearcher) visitingResearcherDAO.save(object);
    }

    @Override
    public void deleteById(int id) {
        visitingResearcherDAO.deleteById(id);
    }

    @Override
    public VisitingResearcher updateOnDatabase(VisitingResearcher object,int id) {
        return (VisitingResearcher) visitingResearcherDAO.updateOnDatabase(object, id);
    }
}
