package user;
import operation.*;
import java.util.Scanner;

public class NormalUser extends User {
    public NormalUser(String name) {
        this.name = name;
        this.operations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation(),
                new DisplayOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("=============================");
        System.out.println("Hello " + this.name + ", Welcome to the movie management system!");
        System.out.println("1. Find Movies");
        System.out.println("2. Borrowing Movies");
        System.out.println("3. Returning Movies");
        System.out.println("4. View Movie");
        System.out.println("0. Exit the system");
        System.out.println("=============================");
        System.out.println("Please enter your selection:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
