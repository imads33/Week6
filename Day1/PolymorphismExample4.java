/*
Write a program that demonstrates method overriding. Define a superclass called Shape with a method called getArea() that returns 0. Define two subclasses, Circle and Rectangle, that extend Shape and override the getArea() method to calculate and return the area of their respective shapes. In the main method, create instances of both Circle and Rectangle and call their getArea() methods.
*/

class Shapes {
    public double getArea() {
        return 0.0;
    }
}

class Rectangle extends Shapes {
    public double getArea(double a) {
        double area = a * a;
        return area;
    }
}

class Circle extends Shapes {
    public double getArea(double r) {
        double area = 3.14f * r * r;
        return area;
    }
}

class PolymorphismExample4 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Circle c = new Circle();
        System.out.println("Area is " + rect.getArea());
        System.out.println("Area is " + c.getArea());
    }
}