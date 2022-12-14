import java.util.Scanner;

public class BarkodGenerator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int begOfInterval = Integer.parseInt(reader.nextLine());
        int endOfInterval = Integer.parseInt(reader.nextLine());
        if (begOfInterval > endOfInterval) {
            int temp = begOfInterval;
            begOfInterval = endOfInterval;
            endOfInterval = temp;
        }

        int d1from = begOfInterval / 1000;
        int d1to = endOfInterval / 1000;
        int d2from = (begOfInterval / 100) % 10;
        int d2to = (endOfInterval / 100) % 10;
        int d3from = (begOfInterval / 10) % 10;
        int d3to = (endOfInterval / 10) % 10;
        int d4from = begOfInterval % 10;
        int d4to = endOfInterval % 10;

        String d1Valid = "";
        String d2Valid = "";
        String d3Valid = "";
        String d4Valid = "";

        for (int i = d1from; i <= d1to; i++) {
            if(i % 2 == 1)  d1Valid += i;
        }
        for (int i = d2from; i <= d2to; i++) {
            if(i % 2 == 1)  d2Valid += i;
        }
        for (int i = d3from; i <= d3to; i++) {
            if(i % 2 == 1)  d3Valid += i;
        }
        for (int i = d4from; i <= d4to; i++) {
            if(i % 2 == 1)  d4Valid += i;
        } 

        for(int i = 0; i < d1Valid.length(); i++)
            for(int j = 0; j < d2Valid.length(); j++)
                for(int k = 0; k < d3Valid.length(); k++)
                    for(int l = 0; l < d4Valid.length(); l++) {
                        System.out.print( d1Valid.charAt(i));
                        System.out.print( d2Valid.charAt(j));
                        System.out.print( d3Valid.charAt(k));
                        System.out.print( d4Valid.charAt(l));
                        System.out.print(" ");
                    }
    }
}