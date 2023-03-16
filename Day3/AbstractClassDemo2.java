/*
Write an abstract class "Vehicle" with an abstract method "start()" which will be implemented by its two subclasses "Car" and "Bike". Implement these classes and demonstrate how they start.
*/

abstract class Vehcle {
    // abstrat methods
    abstract String start();

}

class Car extends Vehcle {
    String start() {
        return "Vhrooom Vhroom!";
    }
}

class Bike extends Vehcle {
    String start() {
        return "bhrooom vhroom!";
    }
}

class AbstractClassDemo2 {
    public static void main(String args[]) {
        Vehcle c = new Car();
        Vehcle b = new Bike();

        System.out.println("Car " + c.start());
        System.out.println("Bike " + b.start());
    }
}