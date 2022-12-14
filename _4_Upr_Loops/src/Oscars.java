import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        double score = Double.parseDouble(reader.nextLine());
        int numJudges = Integer.parseInt(reader.nextLine());
        String judgeName = "";
        double points = 0.0;
        for(int i = 0; i < numJudges; i++) {
            judgeName = reader.nextLine();
            points = Double.parseDouble(reader.nextLine());
            score += judgeName.length() * points / 2;
            if(score > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",
                        name, score);
                return;
            }
        }

        System.out.printf("Sorry, %s you need %.1f more!", name, 1250.5 - score);
    }
}
