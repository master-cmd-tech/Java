package lesson3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Abay","Qunanbayev", 3.99);
        Student s2 = new Student("Kanat", "Serikbay", 3.77);
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("Ilyas","Zhansugurov", 3.79));
        list.add(new Student("Mirzhakyp","Dulatov", 3.49));

        System.out.println(s1.getId());
        System.out.println(s2.getId());

        Group group = new Group("IT-2525");
        group.enroll(s1);
        group.enroll(s2);
        group.enroll(list);
        for (Student student : group.getStudents()) {
            System.out.println(student);
        }
    }
}
