import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        double grade = Double.parseDouble(inputReader.nextLine());
        if(grade >= 5.5) {
            System.out.println("Excellent");
        }
    }
}
