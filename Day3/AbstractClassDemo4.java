/*
Create an abstract class "BankAccount" with a non-abstract method "getAccountNumber()". Implement two subclasses "SavingsAccount" and "CheckingAccount" which implement the "getAccountNumber()" method and also override the "withdraw()" and "deposit()" methods according to their own rules.
*/

abstract class BankAccount {
    long accntNo;

    long getAccountNumber() {
        return accntNo;
    }

    void wihdraw(){
        
    }
    void deposit(){
        
    }
}

class SavingsAccount extends BankAccount {
    // long getAccountNumber() {
    // }
    void wihdraw(){
        System.out.println("SavingsAccount withdraw");
    }
    void deposit(){
        System.out.println("SavingsAccount deposit");
    }
}

class CheckingAccount extends BankAccount {
    void wihdraw(){
        System.out.println("Checking withdraw");
    }
    void deposit(){
        System.out.println("Checking deposit");
    }
}