
import movie.MovieList;
import user.Admin;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MovieList movieList = new MovieList();
        User user = login();
        while (true) {
            int choice = user.menu();
            user.doOperation(choice,movieList);
        }

    }

    private static User login() {
        System.out.println("Please, enter a name: ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        System.out.println("Please, enter your e-mail for password: ");
        String name = scanner.nextLine();
        System.out.println(" Please, enter your identity: (0: normal user, 1: administrator");
        int choice = scanner.nextInt();
        if (choice == 0) {
            return new NormalUser(name);
            } else if (choice == 1) {
            return new Admin(name);
        }
        return null;
    }
}
