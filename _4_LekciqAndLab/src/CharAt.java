import java.util.Scanner;

public class CharAt {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        for(int i =0; i<word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
}
