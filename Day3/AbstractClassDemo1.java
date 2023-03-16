/*
Write an abstract class "Shape" which has a method "calculateArea()" which returns the area of the shape. Write two subclasses "Circle" and "Rectangle" which implement the method "calculateArea()" for their respective shapes.
*/

abstract class Shape1 {
    double r,l,w;
    Shape1(double r){
        this.r=r;
    }
    Shape1(double l,double w){
        this.l=l;
        this.w=w;
    }
    
    // abstrat methods
    abstract double calculateArea();
    
}

class Rectangle1 extends Shape1 {
    Rectangle1(double l,double w){
        super(l, w);
    }
    
    double calculateArea() {
        return l*w;
    }

}

class Circle1 extends Shape1 {
    Circle1(double r){
        super(r);
    }
    
    double calculateArea() {
        double area=3.14*r*r;
        return area;
    }
}

class AbstractClassDemo1 {
    public static void main(String args[]) {
        Shape1 s = new Rectangle1(12.0, 13.0);
        Shape1 s1 = new Circle1(12.0);

        System.out.println("Circle Area is "+s1.calculateArea());
        System.out.println("Rectangle Area is "+s.calculateArea());
    }
}