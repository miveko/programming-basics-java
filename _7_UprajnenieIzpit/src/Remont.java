import java.util.Scanner;

public class Remont {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double height = Integer.parseInt(reader.nextLine());
        double width = Integer.parseInt(reader.nextLine());
        int percentage = Integer.parseInt(reader.nextLine());
        double areaToPaint = 4 * height * width * (100 - percentage) /100;
        String litresStr = reader.nextLine();
        while (!litresStr.equals("Tired!")) {
            int litres = Integer.parseInt(litresStr);
            areaToPaint -= litres;
            if(areaToPaint < -0.5) {
                System.out.printf("All walls are painted and you have %.0f l paint left!",
                        Math.abs(areaToPaint));
                return;
            } else if(areaToPaint < 0.5) {
                System.out.println("All walls are painted! Great job, Pesho!");
                return;
            }

            litresStr = reader.nextLine();
        }

        System.out.printf("%.0f quadratic m left.", Math.ceil(areaToPaint));
    }
}
