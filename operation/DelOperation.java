package operation;

import movie.Movie;
import movie.MovieList;

public class DelOperation implements IOperation {
    @Override
    public void work(MovieList movieList) {
        System.out.println(" Delete Operation ");
        System.out.println("Enter the name of the movie to be deleted");
        String name = scanner.nextLine();

        int i = 0;
        for(;i < movieList.getSize(); i++) {
            if (movieList.getMovie(i).name.equals(name)) {
                break;
            }
        }

        if (i >= movieList.getSize()) {
            System.out.println(" No such movie");
            return;
        }
        for (int j = i; j < movieList.getSize(); j++) {
            Movie movie = movieList.getMovie(j + 1);
        }
        movieList.setSize(movieList.getSize() - 1);
        System.out.println("successfully deleted");
    }
}
