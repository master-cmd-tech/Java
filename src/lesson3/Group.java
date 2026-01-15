package lesson3;

import java.util.ArrayList;

public class Group {
    private String name;
    private ArrayList<Student> students;

    public Group(String name) {
        students = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void enroll(ArrayList<Student> students) {
        this.students.addAll(students);
    }
    public void enroll(Student student) {
        students.add(student);
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public int size() {
        return students.size();
    }

}
