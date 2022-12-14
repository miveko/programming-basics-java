public class TablicaUmnojenie {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++)
            for(int j = 0; j <= 10; j++)
                System.out.printf("%2d * %2d = %d%n", i, j, i * j);
    }
}