package lesson1;

public class Main {
    public static void main(String[] args) {
        /*
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0 ; i < n ; i++) {
            System.out.println("Hello World!");
        }
        */
        /*
        task1.Student student = new task1.Student();
        student.setName("Ilnur");
        student.setSurname("Abdrakhmanov");
        System.out.println(student.toString());
         */
        Student[] student = new Student[4];
        student[0] = new Student("Ilnur","Abdrakhmanov", 3.5);
        student[1] = new Student();

        student[1].setName("Abai");
        student[1].setSurname("Qunanbayev");
        student[1].setGpa(4.0);
        System.out.println(student[0].toString());
        System.out.println(student[1].toString());
    }
}