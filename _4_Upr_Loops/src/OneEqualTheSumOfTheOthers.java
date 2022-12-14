import java.util.Scanner;

public class OneEqualTheSumOfTheOthers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int num = 0;
        for(int i = 0; i < n; i++) {
            num = Integer.parseInt(reader.nextLine());
            if(num > max) max = num;
            sum += num;
        }

        sum -= max;
        if(sum == max) {
            System.out.printf("Yes%nSum = %d", sum);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(sum - max));
        }
    }
}
