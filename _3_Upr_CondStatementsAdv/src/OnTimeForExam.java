import java.util.Scanner;

public class OnTimeForExam {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        int examHour = Integer.parseInt(reader.nextLine());
        int examMinutes = Integer.parseInt(reader.nextLine());
        int arriveHour = Integer.parseInt(reader.nextLine());
        int arriveMinutes = Integer.parseInt(reader.nextLine());

        int examTime = examHour * 60 + examMinutes;
        int arriveTime = arriveHour * 60 + arriveMinutes;
        int diffTime = examTime - arriveTime;

        if(diffTime > 59) {
            if(diffTime % 60 > 9) {
                System.out.printf("Early%n%d:%d hours before the start", diffTime / 60, diffTime % 60);
            } else {
                System.out.printf("Early%n%d:0%d hours before the start", diffTime / 60, diffTime % 60);
            }
        } else if(diffTime > 30) {
            System.out.printf("Early%n%d minutes before the start", diffTime);
        } else if(diffTime > 0) {
            System.out.printf("On time%n%d minutes before the start", diffTime);
        } else if(diffTime == 0) {
            System.out.println("On time");
        } else if(diffTime > -60) {
            System.out.printf("Late%n%d minutes after the start", Math.abs(diffTime));
        } else if(Math.abs(diffTime % 60) > 9){
            System.out.printf("Late%n%d:%d hours after the start", Math.abs(diffTime / 60), Math.abs(diffTime % 60));
        } else {
            System.out.printf("Late%n%d:0%d hours after the start", Math.abs(diffTime / 60), Math.abs(diffTime % 60));
        }
    }
}
