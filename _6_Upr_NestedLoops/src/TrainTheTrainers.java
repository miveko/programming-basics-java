import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        String presentationName = reader.nextLine();
        double sumTotal = 0.0;
        int marksTotal = 0;
        while (!presentationName.equals("Finish")) {
            double sumOfMarks = 0.0;
            for(int i=0; i<n; i++) {
                double mark = Double.parseDouble(reader.nextLine());
                sumOfMarks += mark;
                sumTotal += mark;
                marksTotal++;
            }

            System.out.printf("%s - %.2f.%n", presentationName, sumOfMarks / n);
            presentationName = reader.nextLine();
        }

        if(marksTotal > 0)
            System.out.printf("Student's final assessment is %.2f.", sumTotal / marksTotal);
    }
}
