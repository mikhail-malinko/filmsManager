package ru.netology.filmsManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class filmsManagerTest {


    @Test
    public void test() {
        String film1 = "Movie 1";
        String film2 = "Movie 2";
        String film3 = "Movie 3";
        String film4 = "Movie 4";
        String film5 = "Movie 5";
        String film6 = "Movie 6";
        String film7 = "Movie 7";
        String film8 = "Movie 8";
        String film9 = "Movie 9";

        FilmsManager manager = new FilmsManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);

        String[] expected = { film1, film2, film3, film4, film5, film6, film7, film8, film9 };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void lessMoviesThanDefault() {
        String film1 = "Movie 1";
        String film2 = "Movie 2";
        String film3 = "Movie 3";
        String film4 = "Movie 4";
        String film5 = "Movie 5";
        String film6 = "Movie 6";
        String film7 = "Movie 7";
        String film8 = "Movie 8";
        String film9 = "Movie 9";

        FilmsManager manager = new FilmsManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);

        String[] expected = { film9, film8, film7, film6, film5, film4, film3, film2, film1 };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void moviesIsEqualToDefault() {
        String film1 = "Movie 1";
        String film2 = "Movie 2";
        String film3 = "Movie 3";
        String film4 = "Movie 4";
        String film5 = "Movie 5";
        String film6 = "Movie 6";
        String film7 = "Movie 7";
        String film8 = "Movie 8";
        String film9 = "Movie 9";
        String film10 = "Movie 10";

        FilmsManager manager = new FilmsManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);

        String[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void moreMoviesThanDefault() {
        String film1 = "Movie 1";
        String film2 = "Movie 2";
        String film3 = "Movie 3";
        String film4 = "Movie 4";
        String film5 = "Movie 5";
        String film6 = "Movie 6";
        String film7 = "Movie 7";
        String film8 = "Movie 8";
        String film9 = "Movie 9";
        String film10 = "Movie 10";
        String film11 = "Movie 11";

        FilmsManager manager = new FilmsManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);

        String[] expected = { film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void lessFilmsThanSpecified() {
        String film1 = "Movie 1";
        String film2 = "Movie 2";

        FilmsManager manager = new FilmsManager(3);
        manager.addFilm(film1);
        manager.addFilm(film2);


        String[] expected = {film2, film1 };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void moviesAsSpecified() {
        String film1 = "Movie 1";
        String film2 = "Movie 2";
        String film3 = "Movie 3";

        FilmsManager manager = new FilmsManager(3);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);


        String[] expected = {film3, film2, film1 };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void moreFilmsThanGiven() {
        String film1 = "Movie 1";
        String film2 = "Movie 2";
        String film3 = "Movie 3";
        String film4 = "Movie 4";

        FilmsManager manager = new FilmsManager(3);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);


        String[] expected = {film4, film3, film2 };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }


}
