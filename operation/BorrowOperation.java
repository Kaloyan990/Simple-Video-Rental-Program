package operation;
import movie.Movie;
import movie.MovieList;

public class BorrowOperation implements IOperation {
    @Override
    public void work(MovieList movieList) {
        System.out.println("Borrow Operation");
        System.out.println("Enter the name of the movie to be borrowed");
        String name = scanner.nextLine();
        int i = 0;
        for ( ;i < movieList.getSize(); i++) {
            if(movieList.getMovie(i).name.equals(name)){
                break;
            }
        }
        if (i >= movieList.getSize()) {
            System.out.println("No such movie");
            return;
        }

        Movie movie = movieList.getMovie(i);
        if (movie.isBorrowed) {
            System.out.println("Already lent out");
        } else {
            movie.isBorrowed = true;
            System.out.println("Successful Borrowing");
        }
    }
}
