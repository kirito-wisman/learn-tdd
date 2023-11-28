package com.geektime.intro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * JPA create EntityManager, start transaction and persist entity
 */
public class TestApplication {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("john");
        student.setLastName("smith");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.close();
        factory.close();
    }
}
