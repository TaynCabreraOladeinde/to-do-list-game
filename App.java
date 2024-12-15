public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        // Instantiate your objects
        User user = new User("JohnDeer");
        //print your objects
        System.out.println(user); // Print the user object

         // Create a new to-do list for the user
         ToDoList list1 = new ToDoList();
         System.out.println(list1); // Print the to-do list object
 
         // Create some tasks
         Task task1 = new Task("Buy groceries");
         Task task2 = new Task("Finish homework");
         Task task3 = new Task("Call the bank");

         // Print the task objects
         System.out.println(task1);
         System.out.println(task2);
         System.out.println(task3);
         
    }
}
