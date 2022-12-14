import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for(int i = 0;i < n; i++) {
            double num = Double.parseDouble(reader.nextLine());
            if(num < min) min = num;
            if(num > max) max = num;
        }

        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }
}
