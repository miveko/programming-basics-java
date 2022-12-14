import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        final double NOMINATION_QUOTA = 1250.5;
        String name = reader.nextLine();
        double score = Double.parseDouble(reader.nextLine());
        int numOfJour = Integer.parseInt(reader.nextLine());
        for(int i = 0; i < numOfJour; i++) {
            String jourName = reader.nextLine();
            double jourMark = Double.parseDouble(reader.nextLine());
            score += jourMark * jourName.length() / 2;
            if(score > NOMINATION_QUOTA) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, score);
                return;
            }
        }

        System.out.printf("Sorry, %s you need %.1f more!", name, NOMINATION_QUOTA - score);
    }
}
