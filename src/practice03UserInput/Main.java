package practice03UserInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is: " + gpa );
        if(isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
        }
        */

        //Common issues

        /*
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("You are " + age + " years old");
        System.out.println("Your favorite color is " + color);
        */

        // Calculate area of rectangle
        double width = 0;
        double height = 0;
        double area = 0;

        System.out.print("Enter width of rectangle: ");
        width = scanner.nextDouble();

        System.out.print("Enter height of rectangle: ");
        height = scanner.nextDouble();

        area = height * width;

        System.out.print("Area of rectangle: " + area );


        scanner.close();



    }
}
