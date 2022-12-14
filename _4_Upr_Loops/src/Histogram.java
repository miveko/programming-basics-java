import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        int numTo200=0, numTo400=0, numTo600=0, numTo800=0, numTo1000=0;
        int number;
        for(int i=0; i<n; i++) {
            number = Integer.parseInt(reader.nextLine());
            if(number < 200) {
                numTo200++;
            } else if(number < 400) {
                numTo400++;
            } else if(number < 600) {
                numTo600++;
            } else if(number < 800) {
                numTo800++;
            } else {
                numTo1000++;
            }
        }

        System.out.printf("%.2f%%%n", numTo200*100.0/n);
        System.out.printf("%.2f%%%n", numTo400*100.0/n);
        System.out.printf("%.2f%%%n", numTo600*100.0/n);
        System.out.printf("%.2f%%%n", numTo800*100.0/n);
        System.out.printf("%.2f%%%n", numTo1000*100.0/n);
    }
}
