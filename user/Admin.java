package user;
import operation.*;
import java.util.Scanner;

public class Admin extends User {
    public Admin(String name) {
        this.name = name;
        this.operations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println(" ============================ ");
        System.out.println("Hello " + this.name + ", Welcome to the movie management system!");
        System.out.println("1. Find Movies");
        System.out.println("2. New Movie");
        System.out.println("3. Delete Movies");
        System.out.println("4. Show all movies");
        System.out.println("0. Exit the system");
        System.out.println(" ============================ ");
        System.out.println("Please, enter your selection: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
