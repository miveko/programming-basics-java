import java.util.Scanner;

public class Pochivka {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Double neededMoney = Double.parseDouble(reader.nextLine());
        Double currentMoney = Double.parseDouble(reader.nextLine());
        int daysTotal = 0;
        int daysToSpendInRow = 0;
        String action = "";
        Double money = 0.0;

        while (daysToSpendInRow < 5 && currentMoney < neededMoney) {
            action = reader.nextLine();
            money = Double.parseDouble(reader.nextLine());
            daysTotal++;
            if(action.equals("spend")) {
                currentMoney -= money;
                currentMoney = currentMoney < 0 ? 0.0 : currentMoney;
                daysToSpendInRow++;
            } else if(action.equals("save")) {
                currentMoney += money;
            } else {
                System.out.println("Invalid output!");
            }
        }

        if(currentMoney >= neededMoney) {
            System.out.printf("You saved the money for %d days.", daysTotal);
        } else if(daysToSpendInRow == 5) {
            System.out.println("You can't save the money.");
            System.out.println(daysTotal);
        }
    }
}