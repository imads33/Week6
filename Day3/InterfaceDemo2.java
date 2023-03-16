import java.util.Scanner;

interface ATM {
    void deposit();

    void withdraw();

    void getBalance();
}

class SbiATM implements ATM {
    Scanner sc = new Scanner(System.in);
    double balance = 5000;

    public void deposit() {
        System.out.println("Enter deposit amount ");
        double amount = sc.nextDouble();
        balance = balance + amount;
        getBalance();
    }

    public void withdraw() {
        System.out.println("Enter withdraw- amount ");
        double amount = sc.nextDouble();
        balance = balance - amount;
        getBalance();
    }

    public void getBalance() {
        System.out.println("balance is " + balance);
    }
}

class InterfaceDemo2 {
    public static void main(String args[]) {
        ATM atm = new SbiATM();
        atm.deposit();
        atm.withdraw();
        atm.getBalance();
    }
}