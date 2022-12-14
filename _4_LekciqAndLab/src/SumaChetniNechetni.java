import java.util.Scanner;

public class SumaChetniNechetni {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int sumOddPos = 0;
        int sumEvenPos = 0;
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) {
                sumEvenPos += Integer.parseInt(reader.nextLine());
            } else {
                sumOddPos += Integer.parseInt(reader.nextLine());
            }
        }

        if(sumOddPos == sumEvenPos) {
            System.out.printf("Yes%nSum = %d", sumOddPos);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(sumOddPos-sumEvenPos)   );
        }
    }
}
