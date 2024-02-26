import java.util.Scanner;

public class BodyMassIndex1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérlek add meg testsúlyodat kilogrammban: ");
        double weight = scanner.nextDouble();

        System.out.println("Kérlek add meg magasságodat méterben: ");
        double height = scanner.nextDouble();

        calculatorBMI( weight , height);
    }


    public static void calculatorBMI( double a, double b ) {

        double valueBMI = a / ( b * b);
        System.out.println("A számított BMI : " + valueBMI);

        if (valueBMI < 18.5) {

            System.out.println("Alultáplált");

        }


        if (valueBMI >= 18.5 && valueBMI <= 24.9) {

            System.out.println("Normális");

        }

        if (valueBMI >= 25.0 && valueBMI <= 29.9) {

            System.out.println("Túlsúlyos");

        }


        if (valueBMI >= 30.0) {

            System.out.println("Elhízott");

        }


        /* BMI Érték		Kategória
        < 18.5			Alultáplált
        18.5 - 24.9		Normális
        25.0 - 29.9		Túlsúlyos
        >= 30.0			Elhízott

        BMI számítása: kg / (m * m)

         */

    }
}
