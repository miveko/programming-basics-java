    import java.util.Scanner;

public class SmartLily {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int age = Integer.parseInt(reader.nextLine());
        double pricePer = Double.parseDouble(reader.nextLine());
        double priceIgr = Double.parseDouble(reader.nextLine());
        double moneyCollected = 0.0;
        for(int i = 1; i<= age; i++) {
            if(i % 2 == 0) {
                moneyCollected += i*5   - 1;
            } else {
                moneyCollected += priceIgr;
            }
        }

        if(moneyCollected >= pricePer) {
            System.out.printf("Yes! %.2f", moneyCollected - pricePer);
        } else {
            System.out.printf("No! %.2f", pricePer - moneyCollected);
        }
    }
}
