import java.util.Scanner;

public class DepositLihva {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        double suma = Double.parseDouble(inputReader.nextLine());
        double srok = Integer.parseInt(inputReader.nextLine());
        double lihva = Double.parseDouble(inputReader.nextLine());

        double total = (suma * lihva / 100) * (srok / 12) + suma;
        System.out.println(total);
    }
}