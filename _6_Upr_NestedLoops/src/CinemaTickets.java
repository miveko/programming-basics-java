import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String movieName = reader.nextLine();
        int freePlaces = 0;
        int studentTickets = 0;
        int standardTickets = 0;
        int kidsTickets = 0;
        while (!movieName.equals("Finish")) {
            freePlaces = Integer.parseInt(reader.nextLine());
            String ticketType = "";
            for(int i = 0; i < freePlaces; i++) {
                ticketType = reader.nextLine();
                if(ticketType.equals("End")) {
                    System.out.printf("%s - %.2f%% full.%n", movieName, i * 100.0 / freePlaces);
                    break;
                } else if(ticketType.equals("standard")) {
                    standardTickets++;
                } else if(ticketType.equals("kid")) {
                    kidsTickets++;
                } else if(ticketType.equals("student")) {
                    studentTickets++;
                } else System.out.println("Wrong input!!!!!");
            }

            if(!ticketType.equals("End"))   //no free spaces left
                System.out.printf("%s - 100.00%% full.%n", movieName);
            movieName = reader.nextLine();
        }

        int totalTickets = kidsTickets + standardTickets + studentTickets;
        System.out.println("Total tickets: " + totalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentTickets * 100.0 / totalTickets);
        System.out.printf("%.2f%% standard tickets.%n", standardTickets * 100.0 / totalTickets);
        System.out.printf("%.2f%% kids tickets.%n", kidsTickets * 100.0 / totalTickets);
    }
}
