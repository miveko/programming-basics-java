import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int num = Integer.parseInt(inputReader.nextLine());
        if(num % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}
