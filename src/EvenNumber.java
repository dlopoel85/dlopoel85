import java.util.Scanner;

public class EvenNumber {

    public static void main(String[] agrs) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Kérlek add meg egy egész számot -100 és 100 között: ");
        int num1 = scanner.nextInt();

        num1 = checkInterval(num1, -100, 100);

        System.out.println("2. Kérlek add meg egy egész számot -100 és 100 között: ");
        int num2 = scanner.nextInt();

        num2 = checkInterval(num2, -100, 100);

        int kezdo = num1 < num2 ? num1 : num2;
        int veg = num1 > num2 ? num1 : num2;

        /*
        beépített funkcióval még szebb lehet 🙂
        int kezdo = Math.min(num1, num2);
        int veg = Math.max(num1, num2);
        */

        System.out.println("Az intervallum kezdő száma: " + kezdo + ", a vég száma: " + veg);

        evenNum(kezdo, veg);
        System.out.println();
        System.out.println("Végetért a játék!");
    }

    public static int checkInterval(int actualNumber, int min, int max) {
        Scanner scanner = new Scanner(System.in);

        while (actualNumber < min || actualNumber > max)
        {
            System.out.println("Újra!");
            actualNumber = scanner.nextInt();
        }

        return actualNumber;
    }

    public static void evenNum(int num1, int num2) {
        for (int i = num1; i < num2; i++) {
            if (i % 2 == 0 && i != num1) {
                System.out.print(i + ", ");
            }
        }
    }
}
