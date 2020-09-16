package user;

import movie.MovieList;
import operation.IOperation;

public abstract class User {
    protected String name;
    protected IOperation[] operations;
    public abstract int menu();

    public void doOperation(int choice, MovieList movieList) {
        operations[choice].work(movieList);
    }
}
