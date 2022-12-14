import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        String name = inputReader.nextLine();
        int duration = Integer.parseInt(inputReader.nextLine());
        int breakDuration = Integer.parseInt(inputReader.nextLine());
        double timeLeft = 0.625 * breakDuration - duration;

        if(timeLeft >= 0) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",
                    name, timeLeft);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",
                    name, Math.ceil(Math.abs(timeLeft)));
        }
    }
}
