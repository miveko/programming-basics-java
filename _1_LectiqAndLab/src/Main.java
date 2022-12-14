import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Type something: ");
        Scanner inputReader = new Scanner(System.in);
        String input = inputReader.nextLine();
        System.out.println("You wrote: " + input + System.lineSeparator() + "Hahaha" + System.lineSeparator());

        System.out.print("Now type a whole number: ");
        input = inputReader.nextLine();
        int num = 0;
        boolean valid = false;
        do {
            try {
                num = Integer.parseInt(input);
                if(num > 0) {
                    valid = true;
                }  else {
                    System.out.println("The number must be positive.");
                    System.out.println("Please, type a whole positive number: ");
                    input = inputReader.nextLine();
                }
            } catch (Exception e) {
                System.out.println("Unable to convert the input to a number.");
                System.out.println("Please, type a whole number: ");
                input = inputReader.nextLine();
            }
        } while (!valid);

        int area = num * num;
        System.out.println("Aria of a rectanble with a=" + num + " is: " + area);
    }
}