package com.example.moviedatabase.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public abstract class EntityDao<T> implements AutoCloseable {
    private static EntityManagerFactory factory =
            Persistence.createEntityManagerFactory("main");
    protected EntityManager em;

    protected EntityDao() {
        em = factory.createEntityManager();
    }

    public abstract T getById
            (int id);

    public abstract List<T> getAll();

    @Override
    public void close() throws Exception {
        if (em.isOpen()) {
            em.close();

        }
    }

    public void update(T entity) {
        try {
            em.getTransaction().begin();
            em.merge(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void insert(T entity) {
        try {
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();

        }
    }
    public void delete(T entity) {
        try {
            em.getTransaction().begin();
            em.remove(entity);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();

        }
    }


}