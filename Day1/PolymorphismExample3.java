class Banks {
    public void rateOfInterest() {
        System.out.println("Parent rate of intrest is 10%");
    }
}

class SBI extends Banks {
    public void rateOfInterest() {
        super.rateOfInterest();
        System.out.println("SBI rate of intrest is 20%");
    }
}

class HDFC extends Banks {
    public void rateOfInterest() {
        super.rateOfInterest();
        System.out.println("HDFC rate of intrest is 15%");
    }
}

class PolymorphismExample3 {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        HDFC hdfc = new HDFC();

        sbi.rateOfInterest();
        hdfc.rateOfInterest();
    }
}