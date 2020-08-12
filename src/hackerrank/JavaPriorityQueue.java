import java.util.*;


class Priorities {
    public List<Student> getStudents(List<String> events) {
        if (events.size() == 0) return Collections.emptyList();

        PriorityQueue queue = new PriorityQueue<>(
                Comparator.comparing(Student::getCgpa).reversed()
                          .thenComparing(Student::getName)
                          .thenComparing(Student::getId)
        );

        for (String event : events) {
            String[] action = event.split(" ");
            if (action[0].equals("ENTER")) {
                String name = action[1]; // name
                double cgpa = Double.parseDouble(action[2]); // cgpa
                int id = Integer.parseInt(action[3]); // id

                Student student = new Student(id, name, cgpa);
                queue.add(student);
            } else {
                // SERVED
                queue.poll();
            }
        }
        List<Student> result = new ArrayList<>(queue);
        return result;
    }
}

class Student {
    private int id;
    private String name;
    private double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMTPY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
