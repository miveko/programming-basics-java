import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        String type = inputReader.nextLine();
        int colums = Integer.parseInt(inputReader.nextLine());
        int rows = Integer.parseInt(inputReader.nextLine());

        double price = 0.0;
        switch (type) {
            case "Premiere" : price = 12.0; break;
            case "Normal" : price = 7.5; break;
            case "Discount" : price = 5.0; break;
            default:
                System.out.println("invalid input for type");
                return;
        }

        System.out.printf("%.2f leva", colums * rows * price);
    }
}
