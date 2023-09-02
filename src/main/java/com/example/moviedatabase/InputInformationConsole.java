package com.example.moviedatabase;

import com.example.moviedatabase.entity.Movie;

import java.util.List;
import java.util.Scanner;

public class InputInformationConsole {
    Scanner scanner;
    public InputInformationConsole() {
        scanner = new Scanner(System.in);
    }

    public int printMenu()
    {
        System.out.println("1. Вывести фильмы на печать");
        System.out.println("2. Добавить новый фильм");
        System.out.println("3. Удалить фильм");
        System.out.println("4. Обновить данные о фильме");
        System.out.println("5. Поиск по названию");
        System.out.println("6. Поиск по имени актера");
        System.out.println("7. Поиск по имени режиссера");
        System.out.println("8. Поиск по годам");
        System.out.println("9. Вывести топ -10 фильмов");
                System.out.println("10. Выход");
        int option = Integer.parseInt
                (scanner.nextLine());
        return option
                ;
    }

    public void printMovie(List<Movie> movies) {
        for(Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
