import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int min = Integer.parseInt(reader.nextLine());
        int max = Integer.parseInt(reader.nextLine());
        int magic = Integer.parseInt(reader.nextLine());
        int combinations = 0;
        for(int i = min; i <= max; i++)
            for(int j = min; j <= max; j++) {
                combinations++;
                if(i + j == magic) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinations, i, j, magic);
                    return;
                }
            }

        System.out.println(combinations + " combinations - neither equals " + magic);
    }
}
