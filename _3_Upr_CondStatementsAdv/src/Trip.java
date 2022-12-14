import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        double budget = Double.parseDouble(inputReader.nextLine());
        String season = inputReader.nextLine();
        String destination = "";
        String place = "";
        double spent = 0.0;
        if(budget > 1000) {
            destination = "Europe";
        } else if(budget > 100) {
            destination = "Balkans";
        } else {
            destination = "Bulgaria";
        }

        if (season.equals("summer") && !destination.equals("Europe")) {
            place = "Camp";
        } else {
            place = "Hotel";
        }

        switch (destination) {
            case "Bulgaria" : if(season.equals("summer")) {
                spent = 0.3 * budget;
            } else {
                spent = 0.7 * budget;
            } break;
            case "Balkans" : if(season.equals("summer")) {
                spent = 0.4 * budget;
            } else {
                spent = 0.8 * budget;
            } break;
            case "Europe" : spent = 0.9 * budget;
        }

        System.out.printf("Somewhere in %s%n%s - %.2f", destination, place, spent);
    }
}
