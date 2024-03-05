import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérlek add meg a piramis magasságát: ");
        int height = scanner.nextInt();

        System.out.println("Kérlek add meg a piramis szélességét: ");
        int width = scanner.nextInt();

        System.out.println("Milyen szimbólumot használjak?");
        String symbol = scanner.next();

        //drawHalfPyramid(height, width, symbol);
        drawAmorphPyramid(height, width, symbol);

        System.out.println();
        System.out.println("Kész a piramis, végetért a játék!");
    }

    private static void drawHalfPyramid(int height, int width, String symbol) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i && j < width; j++) {
                System.out.print( symbol + " ");
            }
            System.out.println();
        }
    } //TODO miért nem jól rajzolódik ki???

    private static void drawAmorphPyramid(int height, int width, String symbol) {
        for (int i = 0; i < height; i++) {
            // Skip the first iteration by printing one symbol at the beginning
            if(i == 0)
            {
                System.out.println( symbol + " ");
                continue; // Go to the next in the loop
            }

            // Any other case calculate the actual with
            int actualWidth = i * width / height;
            for (int j = 0; j < actualWidth; j++) {
                System.out.print( symbol + " ");
            }

            System.out.println();
        }
    } //TODO miért nem jól rajzolódik ki??? pl 5 és 10 értékekkel egészen szép
}
