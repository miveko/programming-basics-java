import java.util.Scanner;

public class SimpleAndNotSimple {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String numberStr = reader.nextLine();
        int sumPrime = 0;
        int sumNotPrime = 0;
        while (!numberStr.equals("stop")) {
            int num = Integer.parseInt(numberStr);
            if(num <= 0) {
                System.out.println("Number is negative.");
                numberStr = reader.nextLine();
                continue;
            } else if(checkPrime(num)) {
                sumPrime += num;
            } else {
                sumNotPrime += num;
            }
            numberStr = reader.nextLine();
        }

        System.out.println("Sum of all prime numbers is: " + sumPrime);
        System.out.println("Sum of all non prime numbers is: " + sumNotPrime);
    }

    private static boolean checkPrime(int n){
        int m=n/2;
        if(n == 0 || n == 1) {
            return false;
        } else {
            for(int i=2; i<=m; i++){
                if(n % i == 0)  return false;
            }
            return true;
        }
    }
}
