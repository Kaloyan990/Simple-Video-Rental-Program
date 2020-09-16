package operation;

import movie.MovieList;

public class FindOperation implements IOperation{
    @Override
    public void work(MovieList movieList) {
        System.out.println("Find Operation");
        System.out.println("Enter the name of the movie to be borrowed");
        String name = scanner.nextLine();

        int i = 0;
        for(;i < movieList.getSize(); i++) {
            if (name.equals(movieList.getMovie(i).name)) {
                System.out.println(movieList.getMovie(i));
                break;
            }
        }
        if (i >= movieList.getSize()) {
            System.out.println("No this movie");
            return;
        } else {
            System.out.println("Successfully found movies");
        }
    }
}
