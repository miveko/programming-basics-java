import java.util.Scanner;

public class KvartalenMagazin {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        String product = inputReader.nextLine();
        String city = inputReader.nextLine();
        float quantity = Float.parseFloat(inputReader.nextLine());
        double price = -1.0;

        if (product.equals("coffee")) {
            switch (city) {
                case "Sofia" : price = 0.50; break;
                case "Plovdiv" : price = .4; break;
                case "Varna"  : price = .45; break;
            }
        } else if (product.equals("water")) {
            switch (city) {
                case "Sofia" : price = 0.80; break;
                case "Plovdiv" :
                case "Varna"  : price = .70; break;
            }
        } else if (product.equals("beer")) {
            switch (city) {
                case "Sofia" : price = 1.2; break;
                case "Plovdiv" :price = 1.15; break;
                case "Varna"  : price = 1.10; break;
            }
        } else if (product.equals("sweets")) {
            switch (city) {
                case "Sofia" : price = 1.45; break;
                case "Plovdiv" :price = 1.30; break;
                case "Varna"  : price = 1.35; break;
            }
        } else if (product.equals("peanuts")) {
            switch (city) {
                case "Sofia" : price = 1.60; break;
                case "Plovdiv" :price = 1.50; break;
                case "Varna"  : price = 1.55; break;
            }
        }

        if(price == -1.0) {
            System.out.println("Invalid input");
            return;
        } else {
            System.out.println(quantity * price);
        }
    }
}
