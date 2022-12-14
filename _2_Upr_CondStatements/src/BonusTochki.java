import java.util.Scanner;

public class BonusTochki {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int num = Integer.parseInt(inputReader.nextLine());
        double bonus = 0;
        if(num <= 100) {
            bonus = 5;
        } else if(num <= 1000) {
            bonus = 0.20 * num;
        } else {
            bonus = 0.10 * num;
        }

        if(num % 2 == 0) {
            bonus += 1;
        }

        if(num % 10 == 5) {
            bonus += 2;
        }

        System.out.println(bonus);
        System.out.println(bonus + num);
    }
}
