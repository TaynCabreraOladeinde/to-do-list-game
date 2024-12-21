import java.time.LocalDateTime;

public class Task {
    private String title;
    private boolean isComplete;
    private LocalDateTime dueDate;

    public Task(String title, LocalDateTime dueDate) {
        this.title = title;
        this.dueDate = dueDate;
        this.isComplete = false;
    }

    public void markAsComplete() {
        this.isComplete = true;
    }

    public String getDetails() {
        return "Title: " + title + ", Completed: " + isComplete + ", Due Date: " + dueDate;
    }

    @Override
    public String toString() {
        return getDetails();
    }
}
