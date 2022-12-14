import java.util.Scanner;

public class SnookerTickets {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String stage = reader.nextLine();
        String ticketType = reader.nextLine();
        int numberOfTickets = Integer.parseInt(reader.nextLine());
        String incPicture = reader.nextLine();
        double cost = 0.0;
        if (stage.equals("Quarter final")) {
            switch (ticketType) {
                case "Standard" : cost = 55.5; break;
                case "Premium"  : cost = 105.2;break;
                case "VIP"  : cost = 118.9; break;
            }
        } else if (stage.equals("Semi final")) {
            switch (ticketType) {
                case "Standard" : cost = 75.88; break;
                case "Premium"  : cost = 125.22;break;
                case "VIP"  : cost = 300.40; break;
            }
        } else if (stage.equals("Final")) {
            switch (ticketType) {
                case "Standard" : cost = 110.10; break;
                case "Premium"  : cost = 160.66;break;
                case "VIP"  : cost = 400; break;
            }
        } else System.out.println("Negative input for stage or/and ticketType");

        cost *= numberOfTickets;
        if(cost > 4000) {
            cost *= 0.75;
        } else if(cost > 2500){
            cost *= 0.9;
            if(incPicture.equals("Y"))
                cost += numberOfTickets * 40;
        } else {
            if(incPicture.equals("Y"))
                cost += numberOfTickets * 40;
        }

        System.out.printf("%.2f", cost);
    }

}
