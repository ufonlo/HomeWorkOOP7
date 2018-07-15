package Work_7.Tasks;
import Work_7.Filter.Filter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Tasks {
    private final List<Task> tasks = new ArrayList<>();

    public void add(Task task) {
        tasks.add(task);
    }

    public void sort(Comparator<Task> comparator) {
        tasks.sort(comparator);
    }

    public Tasks filter(Predicate<Task> predicate) {
        Tasks tempTasks = new Tasks();
        for (Task tempTask : Filter.filter(tasks, predicate)) {
            tempTasks.add(tempTask);
        }
        return tempTasks;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "tasks=" + tasks +
                '}';
    }
}