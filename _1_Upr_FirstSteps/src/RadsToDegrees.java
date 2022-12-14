import java.util.Scanner;

public class RadsToDegrees  {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        Double rads = Double.parseDouble(inputReader.nextLine());
        Double degrees = rads * 180 / Math.PI;
        System.out.println(degrees);
    }
}
