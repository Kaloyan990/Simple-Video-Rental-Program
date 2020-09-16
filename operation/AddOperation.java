package operation;

import movie.Movie;
import movie.MovieList;

public class AddOperation implements IOperation {
    @Override
    public void work(MovieList movieList) {
        System.out.println("Add Movie");
        System.out.println("Please, enter the name of the Movie");
        String name = scanner.nextLine();
        System.out.println("Please, enter the type of Movie");
        String type = scanner.nextLine();
        Movie movie = new Movie(name,type);

        movieList.movies[movieList.getSize()] = movie;
        movieList.setSize(movieList.getSize() + 1);
        System.out.println("Added successfully");
    }
}
