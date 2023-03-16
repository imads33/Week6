
/*
Create an interface Animal with the following methods:
public void speak();
public void eat();
Create classes Dog, Cat, and Cow that implement this interface. Write a program that accepts the type of animal and calls its speak() and eat() methods.
*/
import java.util.Scanner;

interface Animal {
    public void speak();

    public void eat();
}

class Dog implements Animal {
    public void speak() {
        System.out.println("Dog bark..");
    }

    public void eat() {
        System.out.println("Dog eat..");
    }
}

class Cat implements Animal {
    public void speak() {
        System.out.println("Cat bark..");
    }

    public void eat() {
        System.out.println("Cat eat..");
    }
}

class Cow implements Animal {
    public void speak() {
        System.out.println("Cow bark..");
    }

    public void eat() {
        System.out.println("Cow eat..");
    }
}

class InterfaceDemo4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter animal type : ");
        String name = sc.nextLine();

        if (name == "cow") {
            Animal animal = new Cow();
            animal.speak();
            animal.eat();
        } else if (name == "cow") {
            Animal animal = new Cat();
            animal.speak();
            animal.eat();
        } else {
            Animal animal = new Dog();
            animal.speak();
            animal.eat();
        }
    }
}