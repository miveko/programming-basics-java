import java.util.Scanner;

public class SumOddEvenPositions {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int min = Integer.parseInt(reader.nextLine());
        int max = Integer.parseInt(reader.nextLine());
        for(int i=min; i<max; i++) {
            if(getSumOfDigits(i, true) == getSumOfDigits(i, false)) {
                System.out.print(i + " ");
            }
        }
    }

    private static int getSumOfDigits(int number, boolean odd) {
        int sumOdds = 0;
        int sumEvens = 0;

        while(number > 0) {
            sumEvens += number % 10;
            number /= 10;
            sumOdds += number % 10;
            number /= 10;
        }

        return odd ? sumOdds : sumEvens;
    }
}
