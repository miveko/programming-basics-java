import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int tabs = Integer.parseInt(reader.nextLine());
        double salary = Double.parseDouble(reader.nextLine());
        String site = "";
        for(int i = 0; i < tabs; i++) {
            site = reader.nextLine();
            switch (site) {
                case "Facebook" : salary -= 150; break;
                case "Instagram" : salary -= 100; break;
                case "Reddit" : salary -= 50; break;
            }

            if(salary <= 0 ) {
                System.out.println("You have lost your salary.");
                return;
            }
        }

        System.out.println(Math.round(salary));
    }
}
