public class EvenNum2 {

    public static void main(String[] args) {

        System.out.println("Páros számok 1 és 10 között: ");
        // 1. megoldás
        System.out.println("1. megoldás: ");
        int startNum = 1;
        int endNum = 10;

        for (int i = startNum; i <= endNum; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();

        System.out.println("--------------------");


        //2. megoldás
        System.out.println("2. megoldás: ");
        printEvenNum2(startNum, endNum);


        //3. megoldás:
        //TODO - tömbben az értékek - megoldás folyamatban


        System.out.println();
        System.out.println("Végetért a játék!");

    }

    private static void printEvenNum2(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();

    }
}
