package com.example.moviedatabase.service;

import com.example.moviedatabase.entity.Genre;
import com.example.moviedatabase.repository.EntityDao;

import java.util.List;

public class GenreDao extends EntityDao<Genre> {
    @Override
    public Genre getById(int id) {
        return em.find(Genre.class, id);
    }
    @Override
    public List<Genre> getAll() {
        return em.createQuery("from Genre", Genre.class).getResultList();
    }
}