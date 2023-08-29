package com.example.moviedatabase.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer year;
    private String genre;
    private Double rating;
    private Integer count;

    @ManyToMany
    @JoinTable(
            name = "movie_to_genre",
            joinColumns = { @JoinColumn(name = "movie_id") },
            inverseJoinColumns = { @JoinColumn(name = "genre_id") }
    )
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Genre> genres = new ArrayList<>();
    @OneToMany(mappedBy = "movie", fetch = FetchType.LAZY, orphanRemoval = true)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Actor> actor = new ArrayList<>();
    @OneToMany(mappedBy = "movie")
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<Director> director = new ArrayList<>();

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                ", count=" + count +
                '}';

    }
}
