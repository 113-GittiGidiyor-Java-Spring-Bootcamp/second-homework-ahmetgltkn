package dev.patika.homework2.dao.concretes;

import com.example.dev_patika02.dao.abstracts.CourseDAO;
import com.example.dev_patika02.model.Course;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public class CourseDAOJPA implements CourseDAO<Course> {

    private EntityManager entityManager;


    public CourseDAOJPA(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public List<Course> findAll() {
        return entityManager.createQuery("FROM  Course c ", Course.class).getResultList();
    }

    @Override
    @Transactional
    public Course findById(int id) {
        return entityManager.find(Course.class,id);
    }

    @Override
    @Transactional
    public Course save(Course course) {
        return entityManager.merge(course);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
       Course course = entityManager.createQuery("FROM Course c WHERE c.id=:id", Course.class).setParameter("id",id).getSingleResult();
        entityManager.remove(course);
    }

    @Override
    @Transactional
    public Course updateOnDatabase(Course course,int id) {
        Course foundCourse = entityManager.find(Course.class, id);
        foundCourse.setCourseName(course.getCourseName());
        foundCourse.setCourseCode(course.getCourseCode());
        foundCourse.setCourseCredit(course.getCourseCredit());
        entityManager.merge(foundCourse);
        return foundCourse;
    }
}
