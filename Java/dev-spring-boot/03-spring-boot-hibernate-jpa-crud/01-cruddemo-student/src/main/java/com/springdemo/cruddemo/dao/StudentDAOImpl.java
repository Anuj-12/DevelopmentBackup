package com.springdemo.cruddemo.dao;

import com.springdemo.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

// Marks for component scanning and provides CRUD objects
@Repository
public class StudentDAOImpl implements StudentDAO{

    // define field for entity manager
    // defines a set of methods for accessing lifecycle of persistent entities
    private EntityManager entityManager;

    // inject entity manager using constructor injection

    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // implement the save method
    @Override
    // needed only when we need to update/modify the table
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        // create query
        // JPQL --> Jakarta Query Language
        // In FROM Student <-- Student is the entity name and not the database table
        // JPQL is based on entity name and entity fields instead of database things
        // order by lastName <-- field name (ascending by default)
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student", Student.class);

        // create query results
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String theLastName) {
        // creating the query
        // theData --> named parameter (name placeholder)
        TypedQuery<Student> theQuery = entityManager.createQuery(
                "FROM Student WHERE lastName=:theData", Student.class);

        // set query parameters
        theQuery.setParameter("theData", theLastName);

        // returning the list of students
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student theStudent) {
        // merge can be used to add new entity state or update detached entities
        // detached entity --> an object no longer being managed by the entity manager but still represent some entry in the database
        //     HELP
        entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        // retrieve the student
        Student theStudent = entityManager.find(Student.class, id);

        // delete the student
        entityManager.remove(theStudent);
    }

    @Override
    @Transactional
    public int deleteAll() {

        // executeUpdate() method is used when deleting something in the database
        int numRowsDeleted = entityManager.createQuery("DELETE FROM Student").executeUpdate();

        return numRowsDeleted;
    }
}
