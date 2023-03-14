class Shape {
    public void area(float w, float l) {
        float area = w * l;
        System.out.println("Area is " + area);
    }

    public void area(float r) {
        float area = 3.14f * r * r;
        System.out.println("Area is " + area);
    }

    public void area(double a) {
        double area = a * a;
        System.out.println("Area is " + area);
    }

}

class PolymorphismExample2 {
    public static void main(String[] args) {
        Shape calculate = new Shape();
        calculate.area(5, 6);
        calculate.area(6.6);
        calculate.area(5.6);
    }
}