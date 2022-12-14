import java.util.Scanner;

public class Stemps {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        final int TARGET_STEPS = 10000;
        int steps = 0;
        int currentSteps = 0;
        String line = "";
        boolean lastCommand = false;
        while (steps < TARGET_STEPS && !lastCommand) {
            line = reader.nextLine();
            if(line.equals("Going home")) {
                lastCommand = true;
                line = reader.nextLine();
            }

            currentSteps = Integer.parseInt(line);
            steps += currentSteps;
        }

        if(steps > TARGET_STEPS) {
            System.out.println("Goal reached! Good job!\n" + (steps - TARGET_STEPS) +
                    " steps over the goal!");
        } else {
            System.out.println((TARGET_STEPS - steps) + " more steps to reach goal.");
        }
    }
}
