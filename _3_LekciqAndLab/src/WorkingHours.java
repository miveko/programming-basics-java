import java.util.Scanner;

public class WorkingHours {
    public static void main(String [] args) {
        Scanner inputReader = new Scanner(System.in);

        int hour = Integer.parseInt(inputReader.nextLine());
        String day = inputReader.nextLine();
        if(hour >= 10 && hour <= 18 && !day.equals("Sunday")) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}
