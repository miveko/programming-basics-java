import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String country = reader.nextLine();
        double minBudget;
        while (!country.equals("End")) {
            minBudget = Double.parseDouble(reader.nextLine());

            for(double saved = 0; saved < minBudget; ) {
                saved += Double.parseDouble(reader.nextLine());
            }

            System.out.println("Going to " + country);
            country = reader.nextLine();
        }

    }
}
