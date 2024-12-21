import java.util.Scanner;

public class Main {
    private static User currentUser;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        currentUser = new User(username);

        // Created  2 tasks and displayed them 
        currentUser.createTask("Finish Summative");
        currentUser.createTask("Volunteer for consessions.");
        currentUser.viewTasks();

        // Displays the current user
        System.out.println(currentUser.toString());
    }
}
