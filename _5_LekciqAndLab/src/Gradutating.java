import java.util.Scanner;

public class Gradutating {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        int grade = 1;
        int excluded = 0;
        double sum = 0.00;
        double mark = 0.0;
        while(grade <= 12) {
            mark = Double.parseDouble(reader.nextLine());
            if(mark < 4.00) {
                sum+= mark;
                excluded++;
                if(excluded == 2) {
                    System.out.printf("%s has been excluded at %d grade", name, grade);
                }
            }
            grade++;
            sum += mark;
        }
        System.out.printf("%s graduated. Average grade: %.2f", name, sum / 12);
    }
}

