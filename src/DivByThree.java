public class DivByThree {

    public static void main(String[] args) {

        System.out.println("Hárommal oszható számok -100 és 100 között: ");

        int startNum = -100;
        int endNum = 100;

        for (int i = startNum; i <= endNum; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ",");

                if (i == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println("Végetért a játék!");
    }
}
