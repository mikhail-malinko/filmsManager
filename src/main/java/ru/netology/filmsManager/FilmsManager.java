package ru.netology.filmsManager;

public class FilmsManager {
    private String[] films = new String[0];
    private int limit = 10;

    public FilmsManager() {
        this.limit = limit;

    }

    public FilmsManager(int limit) {
        this.limit = limit;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }

    public String[] findAll() {
        return films;

    }

    public String[] findLast() {
        int result;
        if (films.length < limit) {
            result = films.length;
        } else {
            result = limit;
        }

        String[] tmp = new String[result];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }


}
