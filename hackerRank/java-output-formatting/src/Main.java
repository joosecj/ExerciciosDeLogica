import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String borders = "================================";
        String[][] lines = new String[3][];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = scanner.nextLine().split(" ");
        }
        System.out.println(borders);
        for (int i = 0; i < lines.length; i++) {
            String[] ln = lines[i];
            System.out.printf("%-14s %03d \n", ln[0], Integer.parseInt(ln[1]));
        }
        System.out.println(borders);

//        String stringOne = scanner.nextLine();
//        int intOne = scanner.nextInt();
//
//        String stringTwo = scanner.next();
//        int intTwo = scanner.nextInt();
//
//        String stringThree = scanner.next();
//        int intThree = scanner.nextInt();
//
//        System.out.println("================================");
//        System.out.printf("%-14s %03d \n",stringOne,intOne);
//        System.out.printf("%-14s %03d \n",stringTwo,intTwo);
//        System.out.printf("%-14s %03d \n",stringThree,intThree);
//        System.out.println("================================");
        scanner.close();
    }
}