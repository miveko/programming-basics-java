import java.util.Scanner;

public class Building {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);
        int floors = Integer.parseInt(reader.nextLine());
        int rooms = Integer.parseInt(reader.nextLine());

        for(int i = floors; i > 0; i--) {
            for (int j = 0; j < rooms; j++) {
                //printing the kind of the room according to the particular floor
                if (i == floors)
                    System.out.print("L" + i + j);
                else if(i % 2 == 0)
                    System.out.print("O" + i + j);
                else
                    System.out.print("A" + i + j);
                //adding a space if this is NOT the last room on a floor
                if(j != rooms - 1)
                    System.out.print(" ");
            }

            if(floors != 1) System.out.println();
        }
    }
}
