import java.util.Scanner;

public class TennisRanking {
    static public void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int tournaments = Integer.parseInt(reader.nextLine());
        int scoreBeg = Integer.parseInt(reader.nextLine());
        int score = scoreBeg;
        String place = "";
        int wins = 0;
        for(int i = 0; i < tournaments; i++) {
            place = reader.nextLine();
            switch (place) {
                case "W" : score += 2000;wins++; break;
                case "F" : score += 1200;break;
                case "SF" : score += 720;break;
            }
        }

        System.out.printf("Final points: %d%n", score);
        System.out.printf("Average points: %.0f%n", Math.floor((score - scoreBeg) * 1.0 / tournaments));
        System.out.printf("%.2f%%%n", wins * 100.0 / tournaments);
    }
}
