/*
Online Shopping System: In an online shopping system, there may be a superclass called Product with a method called calculateDiscount() that calculates the discount on the product's price. Different types of products, such as Electronics and Apparel, may be subclasses of Product and override the calculateDiscount() method to calculate the discount based on their specific sales and promotions. For example, an Electronics product may offer a discount based on the purchase amount or bundle deals, while an Apparel product may offer a discount based on the seasonal trends or inventory clearance.
*/

class Product {
    public void calculateDiscount(int price) {
        int discount = 10 * price / 100;
        price = price - discount;
        System.out.println("total price : " + price);
    }
}

class Electronics extends Product {
    public void calculateDiscount(int price) {
        if (price > 5000) {
            super.calculateDiscount(price);
        } else {
            System.out.println("total price : " + price);
            System.out.println("Purchase more for discount");
        }
    }
}

class Apparel extends Product {
    public void calculateDiscount(String season, int price) {
        if (season == "clearence" || season == "occasions") {
            super.calculateDiscount(price);
        } else {
            System.out.println("total price : " + price);
            System.out.println("Purchase more for discount");
        }
    }
}

class PolymorphismExample6 {
    public static void main(String[] args) {
        Apparel apparel = new Apparel();
        Electronics elec = new Electronics();

        elec.calculateDiscount(4500);
        apparel.calculateDiscount("clearence", 4500);
    }
}