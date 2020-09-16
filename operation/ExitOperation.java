package operation;

import movie.MovieList;

public class ExitOperation implements IOperation{
    @Override
    public void work(MovieList movieList) {
        System.out.println("Bye Bye Bye");
        System.exit(0);
    }
}
