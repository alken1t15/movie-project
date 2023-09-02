package com.example.moviedatabase.service;

import com.example.moviedatabase.entity.Actor;
import com.example.moviedatabase.entity.Director;
import com.example.moviedatabase.repository.EntityDao;

import java.util.List;

public class ActorDao extends EntityDao<Actor> {
    @Override
    public Actor getById(int id) {
        return em.find(Actor.class, id);
    }
    @Override
    public List<Actor> getAll() {
        return em.createQuery("from Actor", Actor.class).getResultList();
    }
}