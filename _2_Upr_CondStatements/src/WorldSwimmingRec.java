import java.util.Scanner;

public class WorldSwimmingRec {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        double record = Double.parseDouble(inputReader.nextLine());
        double distance = Double.parseDouble(inputReader.nextLine());
        double timeForOneMeter = Double.parseDouble(inputReader.nextLine());
        double time = distance * timeForOneMeter;
        time += Math.floor(distance / 15) * 12.5;

        if(time < record) {
            System.out.printf("Yes, he succeeded! The new world record is %f seconds.", time);
        } else {
            System.out.printf("No, he failed! He was %f seconds slower.", record - time);
        }
    }
}
