class Demo {
    protected int price;
    private int pid;
}

class Demo1 extends Demo {
    void display() {
        System.out.println(price);
        // System.out.println(pid);
    }
}

class AccessSpecifiers {
    public static void main(String args[]) {
        Demo1 d = new Demo1();
        d.price = 12;
        d.display();
    }
}