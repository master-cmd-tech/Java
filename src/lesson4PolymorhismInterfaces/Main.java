package lesson4PolymorhismInterfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Shape shape = new Rectangle(3,4);
        // System.out.println(shape.area());
        Collection<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(3));
        shapes.add(new Rectangle(3, 4));
        shapes.add(new Triangle(3, 4, 5));

        printShapes(shapes);
    }
        public static void printShapes(Iterable<Shape> shapes) {
            for (Shape shape : shapes) {
                System.out.println(shape.area() + " : " + shape.perimeter());
            }
        }

}
