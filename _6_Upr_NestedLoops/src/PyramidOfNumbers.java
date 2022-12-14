import java.util.Scanner;

public class PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int num = 1;
        for(int i = 1; i <= n; i++)
            for(int j = 1; j <= i; j++) {
                System.out.print(num);
                if (i != j) {
                    System.out.print(" ");
                }
                else {
                    System.out.println();
                }
                if(num == n) return;
                num++;
            }
    }
}