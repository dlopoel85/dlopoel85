import java.util.Scanner;

public class AskNumber {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérlek adj meg egy számot: ");
        int oddNum = scanner.nextInt();

        while (oddNum % 2 == 0) {
            System.out.println("Kérlek adj meg egy számot: ");
            oddNum = scanner.nextInt();
        }

        System.out.println("Páratlan számot adott meg, ezért végetért a játék!");

        // oddNum(oddNum);

    }
}
