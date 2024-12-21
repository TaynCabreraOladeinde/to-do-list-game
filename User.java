public class User {
    private String username;
    private ToDoList toDoList;

    public User(String username) {
        this.username = username;
        this.toDoList = new ToDoList();
    }

    public void createTask(String title) {
        Task newTask = new Task(title, null); 
        toDoList.addTask(newTask);
    }

    public void deleteTask(Task task) {
        toDoList.removeTask(task);
    }

    public void viewTasks() {
        System.out.println(toDoList.toString());
    }

    @Override
    public String toString() {
        return "User: " + username + "\n" + toDoList.toString();
    }
}
