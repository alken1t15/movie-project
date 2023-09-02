package com.example.moviedatabase;

import com.example.moviedatabase.entity.Movie;
import com.example.moviedatabase.service.MovieDao;

import java.util.List;

public class DatabaseService {
    private InputInformationConsole information = new InputInformationConsole();

    private void getTop10() { }
    private void findByYear() { }
    private void findByDirectorName() { }
    private void findByActorName() { }
    private void findByTitle() { }
    private void addMovie() { }
    private void updateMovie() { }
    private void deleteMovie() { }

    public void start() {
        while (true) {
            int action = information.printMenu();
            switch (action) {
                case 1 -> printMovie();
                case 2 -> addMovie();
                case 3 -> deleteMovie();
                case 4 -> updateMovie();
                case 5 -> findByTitle();
                case 6 -> findByActorName();
                case 7 -> findByDirectorName();
                case 8 -> findByYear();
                case 9 -> getTop10();
                case 10 -> {
                    return;
                }
                default -> System.out.println("Неизвестый пункт меню");
            }
        }
    }

    private void printMovie() {
        try(MovieDao movieDao = new MovieDao()) {
            List<Movie> movies = movieDao.getAll();
            information.printMovie(movies);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
