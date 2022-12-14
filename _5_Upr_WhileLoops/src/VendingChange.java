import java.util.Scanner;

public class VendingChange {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Double changeToReturn = Double.parseDouble(reader.nextLine());
        int coins = 0;
        while (changeToReturn > 0) {
            changeToReturn = Math.round(changeToReturn * 100) / 100.0;
            if(changeToReturn >= 2.0) {
                changeToReturn -= 2; coins++;
            } else if(changeToReturn >= 1.0) {
                changeToReturn -=1; coins++;
            } else if(changeToReturn >= .50) {
                changeToReturn -=0.50; coins++;
            } else if(changeToReturn >= 0.20) {
                changeToReturn -=0.20; coins++;
            } else if(changeToReturn >= 0.10) {
                changeToReturn -=0.10; coins++;
            } else if(changeToReturn >= .05) {
                changeToReturn -=0.05; coins++;
            } else if(changeToReturn >= .02) {
                changeToReturn -=0.02; coins++;
            } else if(changeToReturn >= .01) {
                changeToReturn -=0.01; coins++;
            } else break;
        }

        System.out.println(coins);
    }
}
