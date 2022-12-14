import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double naem = Double.parseDouble(reader.nextLine());
        double statuetki = 0.7 * naem;
        double kettering = 0.85 * statuetki;
        double ozvuchavane = 0.5 * kettering;
        double totalExpences = naem + statuetki + kettering + ozvuchavane;
        System.out.printf("%.2f", totalExpences);
    }
}