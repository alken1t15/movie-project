package com.example.moviedatabase.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "actor")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String surname;
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
}