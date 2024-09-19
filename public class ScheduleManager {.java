public class ScheduleManager {

    // Static variable to hold the single instance
    private static ScheduleManager instance;

    // Private constructor to restrict instantiation
    private ScheduleManager() {
        tasks = new ArrayList<>();
    }

    // Method to provide global point of access
    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    // List to hold tasks
    private List<String> tasks;

    // Method to add task
    public void addTask(String task) {
        tasks.add(task);
    }

    // Method to remove task
    public void removeTask(String taskName) {
        tasks.remove(taskName);
    }

    // Method to view tasks
    public List<String> viewTasks() {
        return tasks;
    }
}
