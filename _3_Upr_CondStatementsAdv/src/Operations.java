import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int n1 = Integer.parseInt(inputReader.nextLine());
        int n2 = Integer.parseInt(inputReader.nextLine());
        String operation = inputReader.nextLine();
        String evenOdd = "";
        int result = 0;

        switch (operation) {
            case "+" :
                result = n1 + n2;
                evenOdd = result % 2 == 0 ? "even" : "odd";
                System.out.printf("%d + %d = %d - %s", n1, n2, result, evenOdd);
                break;
            case "-" :
                result = n1 - n2;
                evenOdd = result % 2 == 0 ? "even" : "odd";
                System.out.printf("%d - %d = %d - %s", n1, n2, result, evenOdd);
                break;
            case "*" :
                result = n1 * n2;
                evenOdd = result % 2 == 0 ? "even" : "odd";
                System.out.printf("%d * %d = %d - %s", n1, n2, result, evenOdd);
                break;
            case "/" :
                if(n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    System.out.printf("%d / %d = %.2f", n1, n2, (n1 * 1.0 / n2));
                }break;
            case "%" :
                if(n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    result = n1 % n2;
                    System.out.printf("%d %% %d = %d", n1, n2, result);
                }break;
        }

    }
}
