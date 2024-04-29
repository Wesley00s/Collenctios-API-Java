package list.basicOperations;

import java.util.ArrayList;
import java.util.List;
public class TaskList {
    private List<Task> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(new Task(task));
    }

    public void removeTask(String task) {
        List<Task> tasksToRemove = new ArrayList<>();
        for (Task t : tasks) {
            if (t.getDescription().equals(task)) {
                tasksToRemove.add(t);
            }
        }

        tasks.removeAll(tasksToRemove);
    }

   public int totalTasks() {
        return tasks.size();
   }

   public void printTasks() {
        for (Task t : tasks) {
            System.out.println(t.getDescription());
        }
   }
}
