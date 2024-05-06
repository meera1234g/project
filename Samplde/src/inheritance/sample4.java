package inheritance;

import java.util.Scanner;

class Onseason {
    public double discount(double price) {
        return 0.4 * price;
    }
}

class Offseason {
    public double discount(double price) {
        return 0.15 * price;
    }
}

public class sample4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the season (Onseason/Offseason): ");
        String season = scanner.next();

        double discountedPrice;
        if (season.equals("onseason")) {
            Onseason customerSeason = new Onseason();
            System.out.print("Enter the price of the clothes: ");
            double price = scanner.nextDouble();
            discountedPrice = customerSeason.discount(price);
        } else if (season.equals("offseason")) {
            Offseason customerSeason = new Offseason();
            System.out.print("Enter the price of the clothes: ");
            double price = scanner.nextDouble();
            discountedPrice = customerSeason.discount(price);
        } else {
            System.out.println("Invalid season entered.");
            return;
        }
          System.out.println("Discounted price: " + discountedPrice);

       
    }
}

