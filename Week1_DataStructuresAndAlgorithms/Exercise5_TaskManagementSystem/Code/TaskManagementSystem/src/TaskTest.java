import java.util.LinkedList;

public class TaskTest
{
    public LinkedList<Task> tasks = new LinkedList<>();

    public void addTask(int id, String name, String status)
    {
        tasks.add(new Task(id, name, status));
        System.out.println("Task Added Successfully!!!");
    }

    public void searchTask(int id)
    {
        int flag = 0;
        for(Task task: this.tasks)
        {
            if(task.taskID == id)
            {
                System.out.println("Searched Task:");
                System.out.println("ID: "+task.taskID+", Name: "+task.taskName+", Status: "+task.taskStatus);
                flag = 1;
            }
        }
        if(flag==0) System.out.println("No such task!!!");
    }

    public void showTasks()
    {
        System.out.println("Tasks:");
        for(Task task: this.tasks)
        {
            System.out.println("ID: "+task.taskID+", Name: "+task.taskName+", Status: "+task.taskStatus);
        }
    }

    public void deleteTask(int id)
    {
        this.tasks.removeIf((task)->(task.taskID == id));
        System.out.println("Task with ID: "+id+" deleted successfully!!!");
    }

    public static void main(String args[])
    {
        TaskTest test = new TaskTest();

        test.addTask(1, "ABC", "Active");
        test.addTask(2, "XYZ", "Pending");
        test.addTask(3, "PQR", "Pending");

        test.showTasks();

        test.searchTask(1);

        test.deleteTask(2);

        test.showTasks();
    }
}