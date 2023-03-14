/*
2. Point of Sale System: Create a class called "Product" that represents a product. The class should have properties such as name, price, and quantity, and methods such as getName, getPrice and getQuantity. Create another class called "PointOfSale" that represents a point of sale system. The class should have a list of products, and methods such as addProduct, removeProduct, and getTotalCost.
*/
import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int quantity;

    void setName(String name) {
        this.name = name;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    int getQuantity() {
        return quantity;
    }
}

class PointOfSale {
    Scanner sc = new Scanner(System.in);
    Product product[] = new Product[5];
    Product prdct = new Product();
    int noOfProducts = 0;

    void addProduct() {
        System.out.println("Enter product name : ");
        prdct.setName(sc.nextLine());
        System.out.println("Enter product price : ");
        prdct.setPrice(sc.nextDouble());
        product[noOfProducts] = prdct;
        noOfProducts++;
    }

    void removeProduct() {
        System.out.println("Enter product name to remove: ");
        String name = sc.nextLine();
        int index = 0;
        for (int i = 0; i < noOfProducts; i++) {
            Product prdct = (Product) product[i];
            if (prdct.getName() == name) {
                index = i;
                break;
            }
        }
        for (int i = index; i < noOfProducts; i++) {
            product[i] = product[i + 1];
        }
        noOfProducts--;
    }

    void getTotalCost() {
        System.out.println("Enter product name: ");
        String name = sc.nextLine();
        System.out.println("Enter product quantity : ");
        prdct.setQuantity(sc.nextInt());

        for (int i = 0; i < noOfProducts; i++) {
            Product prdct = (Product) product[i];
            if (prdct.getName() == name) {
                double totalCost=prdct.getPrice()*prdct.getQuantity();
            }
        }
    }
}

public class MacroAssignment2 {
    public static void main(String[] args) {

    }
}