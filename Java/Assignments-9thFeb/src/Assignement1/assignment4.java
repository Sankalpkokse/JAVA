package Assignement1;

/*
    a. create an interface named 'Shape' with a single abstract method 'area()'.
    b. implement this 'Shape' interface with two classes: 'Circle' and 'Rectangle'. each class should calculate and return its
        respective area when the 'area()' method is called
    c. create a list of 'Shape' objects that include both circles and rectangles
    d. use Java 8's Stream API to
        - filter the list to include only shapes with an area greater than 50
        - calculate and print the total area of filtered shapes
    e. create an interface named 'Resizable' with a default method 'resize(double factor)' that resizes an object proportionally
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//interface Resizable {
//    default void resize(double factor){
//
//    }
//}
interface Shape{
    double area();
}
class Circle implements Shape {
    double area;
    Circle(int r){
        area = (3.14*r*r);
    }

    @Override
    public double area() {
        return area;
    }
}
class Square implements Shape{

    double area;
    Square(int length){
        area = length*length;
    }
    @Override
    public double area() {
        return area;
    }
}
public class assignment4 {
    public static void main(String[] args) {
        Shape circle1 = new Circle(7);
        Shape circle2 = new Circle(10);
        Shape square1 = new Square(8);
        Shape square2 = new Square(21);
        List<Shape> list = new ArrayList<>();
        list.add(circle1);
        list.add(circle2);
        list.add(square1);
        list.add(square2);

        List<Shape> totalArea = list.stream().filter(shape -> shape.area()>50).toList();
        System.out.println(totalArea.size());

        Iterator<Shape> it = totalArea.iterator();
        double sum = 0;
        while(it.hasNext()){
            sum = sum + it.next().area();
//            System.out.println(it.next().area());
        }
        System.out.println("Total sum of area of Shape having area more than 50: " + sum);
    }
}
