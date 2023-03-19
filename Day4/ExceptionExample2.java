class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}

class ATM {
    void withdrawAmount(double amount) throws InvalidAmountException {
        double balance = 20000;
        if (amount >= 100 && amount % 100 == 0) {
            if (amount > balance) {
                System.out.println("withdraw Success");
            } else {
                throw new InvalidAmountException("Invalid Amount ! insufficient balance");
            }
        } else {
            throw new InvalidAmountException("Invalid Amount ! Amount must be multiple of hundreds");
        }
    }
}

class ExceptionExample2 {
    public static void main(String args[]) {
        ATM atm = new ATM();
        try {
            atm.withdrawAmount(25000);
        } catch (InvalidAmountException e) {
            System.out.println(e);
        }
    }
}