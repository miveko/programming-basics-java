import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        for(int i=1111; i<=9999; i++) {
            if(isMagical(n, i))
                System.out.print(i + " ");
        }
    }

    private static boolean isMagical(int n, int number) {
        while (number > 0) {
            int lastDigit = number % 10;
            if(lastDigit == 0 || n % lastDigit != 0)
                return false;
            number /= 10;
        }
        return true;
    }
}
