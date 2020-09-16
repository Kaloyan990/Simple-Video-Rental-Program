package movie;

public class Movie {

    public String name;
    public String type;
    public boolean isBorrowed;

    public Movie(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name '" + name + '\'' +
                ", type '" + type + '\'' +
                " " + ((isBorrowed == true) ? "Already lent out" : "Not lent") +
                '}';
    }
}
