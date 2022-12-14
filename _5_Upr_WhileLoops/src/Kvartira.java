import java.util.Scanner;

public class Kvartira {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int freeSpace = 1;
        for(int i = 0; i < 3; i++) {
            freeSpace *= Integer.parseInt(reader.nextLine());
        }

        do {
            String line = reader.nextLine();
            if(line.equals("Done")) {
                break;
            }
            int kashonSize = Integer.parseInt(line);
            freeSpace -= kashonSize;
        } while (freeSpace >= 0);

        if(freeSpace > 0) {
            System.out.println(freeSpace +" Cubic meters left.");
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", -freeSpace);
        }
    }
}

