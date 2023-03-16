/*
Create an interface Shape with the following methods:
public double area();
public double perimeter();
Create classes Circle, Rectangle, and Triangle that implement this interface.
*/
interface Shape {
    public double area();

    public double perimeter();
}

class Circle implements Shape {
    int r;

    public void setValue(int r) {
        this.r = r;
    }

    public double area() {
        double area = 3.14 * r * r;
        return area;
    }

    public double perimeter() {
        double perimeter = 2 * 3.14 * r;
        return perimeter;
    }
}

class Rectangle implements Shape {
    int l, w;

    public void setValue(int l, int w) {
        this.l = l;
        this.w = w;
    }

    public double area() {
        double area = w * l;
        return area;
    }

    public double perimeter() {
        double perimeter = 2 * (l + w);
        return perimeter;
    }
}

class Triangle implements Shape {
    int h, b, c, a;

    Triangle(int b, int h) {
        this.b = b;
        this.h = h;
    }

    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double area = 1 / 2 * (b * h);
        return area;
    }

    public double perimeter() {
        double perimeter = a + b + c;
        return perimeter;
    }
}

class InterfaceDemo5 {
    public static void main(String[] args) {
        Shape s = new Triangle(3, 5);
        System.out.println("area is " + s.area());
        Shape s1 = new Triangle(3, 5, 6);
        System.out.println("primeter is " + s1.perimeter());
    }
}