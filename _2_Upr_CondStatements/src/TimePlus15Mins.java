import java.util.Scanner;

public class TimePlus15Mins {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int hours = Integer.parseInt(inputReader.nextLine());
        int minutes = Integer.parseInt(inputReader.nextLine());

        minutes += 15;
        hours += minutes / 60;
        minutes %= 60;
        hours %= 24;
        String result = (minutes < 10) ? hours + ":0" + minutes  : hours + ":" + minutes;
        System.out.println(result);
    }
}
