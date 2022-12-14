import java.util.Scanner;

public class ChetniStepeniNaDve {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        for (int i = 0; i <=n; i+=2) {
            System.out.println(Math.round(Math.pow(2, i)));
        }
    }
}
