import java.util.Scanner;

public class Main {
    private static User currentUser;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        currentUser = new User(username);

        // Example of creating tasks and displaying them
        currentUser.createTask("Finish homework");
        currentUser.createTask("Go grocery shopping");
        currentUser.viewTasks();

        // Display the current user
        System.out.println(currentUser.toString());
    }
}
