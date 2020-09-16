package operation;

import movie.MovieList;

public class DisplayOperation implements IOperation {
    @Override
    public void work(MovieList movieList) {
        System.out.println("Display Operation");
        for (int i = 0; i <movieList.getSize(); i++) {
            System.out.println(movieList.getMovie(i));
        }
    }
}
