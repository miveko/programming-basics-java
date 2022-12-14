import java.util.Scanner;

public class SkorostnoIzkachvane {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double currentRec = Double.parseDouble(reader.nextLine());
        double distance = Double.parseDouble(reader.nextLine());
        double seconPerMeter = Double.parseDouble(reader.nextLine());
        double timeOfGeorge = distance * seconPerMeter;
        timeOfGeorge += Math.floor(distance / 50) * 30;
        if(timeOfGeorge >= currentRec) {
            System.out.printf("No! He was %.2f seconds slower.", timeOfGeorge - currentRec);
        } else {
            System.out.printf("Yes! The new record is %.2f seconds.", timeOfGeorge);
        }
    }
}
