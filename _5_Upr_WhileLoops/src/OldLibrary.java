import java.util.Objects;
import java.util.Scanner;

public class OldLibrary {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String targetBook = reader.nextLine();
        int booksChecked = 0;
        String book = "";
        boolean endOfSearch = false;
        do {
            book = reader.nextLine();
            if(book.equals(targetBook)) {
                System.out.printf("You checked %d books and found it.", booksChecked);
                endOfSearch = true;
            } else if (Objects.equals(book, "No More Books")) {
                System.out.println("The book you search is not here!");
                System.out.println("You checked " + booksChecked + " books.");
                endOfSearch = true;
            }
            booksChecked++;
        } while (!endOfSearch);
    }
}
