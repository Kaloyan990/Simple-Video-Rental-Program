package operation;

import movie.MovieList;

import java.util.Scanner;

public interface IOperation {
    Scanner scanner = new Scanner(System.in);
    void work(MovieList movieList);
}
