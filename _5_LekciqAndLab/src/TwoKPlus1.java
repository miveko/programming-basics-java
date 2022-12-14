import java.util.Scanner;

public class TwoKPlus1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int num = 1;
        while(num <= n) {
            System.out.println(num);
            num = num * 2 + 1;
        }
    }
}
