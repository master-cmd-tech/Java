package practice02Variables;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

    // ❎ variable = a reusable container for a value
    //               a variable behaves as if it was the value it contains

    // 📕 Primitive = simple value stored directly in memory (stack)
    // 📘 References = memory address (stack) that points to the heap (heap)

    // 📕 Primitive vs 📘 References
    //    ----------      -----------
    //    int             string
    //    double          array
    //    char            object
    //    boolean

    // 2 Steps to creating a variable
    // ------------------------------
    // 1. declaration
    // 2. assignment

    int age = 21;
    int year = 2026;
    int quantity = 1;

    System.out.println("This year is " + year);

    double price = 19999.99;
    double gpa = 3.3;
    double temperature = -12.5;

    System.out.println("$"+price);

    char grade = 'A';
    char symbol = '!';
    char currency = '$';

    System.out.println(grade);

    boolean isStudent = true;
    boolean forSale = true;
    boolean isOnline = false;

    if(isStudent){
        System.out.println("You are a student");
    } else {
        System.out.println("You are NOT a student");
    }

    String name = "Bro Code";
    String food = "dumplings";
    String email = "fake123@gmail.com";
    String car = "Mustang";
    String color = "red";


    System.out.println("Your choice is a " + color + ' ' + year + " " + car);
    System.out.println("The price is: " + price);

    if(forSale) {
        System.out.println("There is a " + car + " for sale");
    } else {
        System.out.println("The " + car + " is not for sale");
    }
    }
}
