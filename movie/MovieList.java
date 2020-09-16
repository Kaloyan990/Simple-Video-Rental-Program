package movie;

public class MovieList {

    public Movie[] movies = new Movie[10];

    public int size;
    public MovieList() {
        movies[0] = new Movie("Three Kingdoms", "Fiction");
        movies[1] = new Movie("Dream of Red Mansions", "Fiction");
        movies[2] = new Movie("Die Hard","Action");
        movies[3] = new Movie("RIO","Animation");
        movies[4] = new Movie("Lord Of The Rings","Fiction");
        movies[5] = new Movie("Shrek","Animation");
        movies[6] = new Movie("Star Trek","Fiction");
        this.size = 7;

    }

    public Movie getMovie(int pos) {
        return movies[pos];
    }

    public void setMovies(int pos, Movie movie) {
        this.movies[pos] = movie;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


}
