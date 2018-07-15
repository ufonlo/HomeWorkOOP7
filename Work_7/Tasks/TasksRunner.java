package Work_7.Tasks;
import java.time.LocalDate;

public class TasksRunner {
    public static void main(String[] args) {
        Task taskOne = new Task(1, "Task1", "Description1", LocalDate.of(2005, 2,
                10), Priority.NORMAL);
        Task taskTwo = new Task(2, "Task2", "Description2", LocalDate.of(2020, 2,
                10), Priority.MAJOR);
        Task taskThree = new Task(3, "Task3", "Description3", LocalDate.of(2006, 2,
                10), Priority.MINOR);

        Tasks tasks = new Tasks();
        tasks.add(taskOne);
        tasks.add(taskTwo);
        tasks.add(taskThree);


        System.out.println(tasks.filter(TaskPredicates.hasExpiredDeadline()));
        System.out.println(tasks.filter(TaskPredicates.hasPriority(Priority.MAJOR)));
        System.out.println(tasks.filter(TaskPredicates.nameContains("Tas")));
        System.out.println();

        tasks.sort(TaskComparators.byName());
        System.out.println(tasks);
        System.out.println();

        tasks.sort(TaskComparators.byDeadline());
        System.out.println(tasks);
        System.out.println();

        tasks.sort(TaskComparators.byPriority());
        System.out.println(tasks);
    }
}
//Test
//Tasks{tasks=[Task{id=1, name='Task1', description='Description1', deadline=2005-02-10, priority=NORMAL}, Task{id=3, name='Task3', description='Description3', deadline=2006-02-10, priority=MINOR}]}
//Tasks{tasks=[Task{id=2, name='Task2', description='Description2', deadline=2020-02-10, priority=MAJOR}]}
//Tasks{tasks=[Task{id=1, name='Task1', description='Description1', deadline=2005-02-10, priority=NORMAL}, Task{id=2, name='Task2', description='Description2', deadline=2020-02-10, priority=MAJOR}, Task{id=3, name='Task3', description='Description3', deadline=2006-02-10, priority=MINOR}]}
//
//Tasks{tasks=[Task{id=1, name='Task1', description='Description1', deadline=2005-02-10, priority=NORMAL}, Task{id=2, name='Task2', description='Description2', deadline=2020-02-10, priority=MAJOR}, Task{id=3, name='Task3', description='Description3', deadline=2006-02-10, priority=MINOR}]}
//
//Tasks{tasks=[Task{id=1, name='Task1', description='Description1', deadline=2005-02-10, priority=NORMAL}, Task{id=3, name='Task3', description='Description3', deadline=2006-02-10, priority=MINOR}, Task{id=2, name='Task2', description='Description2', deadline=2020-02-10, priority=MAJOR}]}
//
//Tasks{tasks=[Task{id=3, name='Task3', description='Description3', deadline=2006-02-10, priority=MINOR}, Task{id=1, name='Task1', description='Description1', deadline=2005-02-10, priority=NORMAL}, Task{id=2, name='Task2', description='Description2', deadline=2020-02-10, priority=MAJOR}]}
//
//Process finished with exit code 0
