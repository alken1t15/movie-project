package com.example.moviedatabase.service;

import com.example.moviedatabase.entity.Movie;
import com.example.moviedatabase.repository.EntityDao;

import java.util.List;

public class MovieDao extends EntityDao<Movie> {
    @Override
    public Movie getById(int id) {
        return em.find(Movie.class, id);
    }
    @Override
    public List<Movie> getAll() {
        return em.createQuery("from Movie", Movie.class).getResultList();
    }
}
