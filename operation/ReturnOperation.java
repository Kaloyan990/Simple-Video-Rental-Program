package operation;

import movie.Movie;
import movie.MovieList;

public class ReturnOperation implements IOperation {
    @Override
    public void work(MovieList movieList) {
        System.out.println("Return Operation");
        System.out.println("Enter the name of the movie to be returned");
        String name = scanner.nextLine();

        int i = 0;
        for(;i < movieList.getSize(); i++) {
            if (movieList.getMovie(i).name.equals(name)) {
                break;
            }
        }

        if (i >= movieList.getSize()) {
            System.out.println("No this movie");
            return;
        }
        Movie movie = movieList.getMovie(i);
        if (movie.isBorrowed) {
            movie.isBorrowed = false;
            System.out.println("Return Successful");
        } else  {
            System.out.println("Not lent");
        }
    }
}
