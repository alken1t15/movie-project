package com.example.moviedatabase.service;

import com.example.moviedatabase.entity.Director;
import com.example.moviedatabase.repository.EntityDao;

import java.util.List;

public class DirectorDao extends EntityDao<Director> {
    @Override
    public Director getById(int id) {
        return em.find(Director.class, id);
    }
    @Override
    public List<Director> getAll() {
        return em.createQuery("from Director", Director.class).getResultList();
    }
}