
/*
Create an interface Employee with the following methods:public void calculateSalary();
public void displayEmployeeDetails();
Create classes Manager, Developer, and Tester that implement this interface. Write a program that accepts the type of employee and their details (name, age, designation, salary) and calculates their salary based on their designation. Display the employee details and the calculated salary.
*/
import java.util.Scanner;

interface Employee {
    public void calculateSalary();

    public void displayEmployeeDetails();

    void setDetails(String name, String designation, int age, double salary);
}

class Manager implements Employee {
    String name, designation;
    double salary;
    int age;

    public void setDetails(String name, String designation, int age, double salary) {
        this.name = name;
        this.designation = designation;
        this.age = age;
        this.salary = salary;
    }

    public void calculateSalary() {
        salary = salary + 7000 + 4000;
        System.out.println("total salary : " + salary);
    }

    public void displayEmployeeDetails() {
        System.out.println("name : " + name);
        System.out.println("designation : " + designation);
        System.out.println("age : " + age);
        System.out.println("salary : " + salary);
    }
}

class Developer implements Employee {
    String name, designation;
    double salary;
    int age;

    public void setDetails(String name, String designation, int age, double salary) {
        this.name = name;
        this.designation = designation;
        this.age = age;
        this.salary = salary;
    }

    public void calculateSalary() {
        salary = salary + 6500 + 3500;
        System.out.println("total salary : " + salary);
    }

    public void displayEmployeeDetails() {
        System.out.println("name : " + name);
        System.out.println("designation : " + designation);
        System.out.println("age : " + age);
        System.out.println("salary : " + salary);
    }
}

class Tester implements Employee {
    String name, designation;
    double salary;
    int age;

    public void setDetails(String name, String designation, int age, double salary) {
        this.name = name;
        this.designation = designation;
        this.age = age;
        this.salary = salary;
    }

    public void calculateSalary() {
        salary = salary + 9500 + 4500;
        System.out.println("total salary : " + salary);
    }

    public void displayEmployeeDetails() {
        System.out.println("name : " + name);
        System.out.println("designation : " + designation);
        System.out.println("age : " + age);
        System.out.println("salary : " + salary);
    }
}

class InterfaceDemo3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = sc.nextLine();
        System.out.println("Enter designation : ");
        String designation = sc.nextLine();
        System.out.println("Enter age : ");
        int age = sc.nextInt();
        System.out.println("Enter salary : ");
        double salary = sc.nextDouble();

        if (designation == "manager") {
            Employee emp = new Manager();
            emp.setDetails(name, designation, age, salary);
            emp.displayEmployeeDetails();
            emp.calculateSalary();
        } else if (designation == "tester") {
            Employee emp = new Tester();
            emp.setDetails(name, designation, age, salary);
            emp.displayEmployeeDetails();
            emp.calculateSalary();
        } else {
            Employee emp = new Developer();
            emp.setDetails(name, designation, age, salary);
            emp.displayEmployeeDetails();
            emp.calculateSalary();
        }
    }
}