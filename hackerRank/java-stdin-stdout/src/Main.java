import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberInt = sc.nextInt();
        double numberDouble = sc.nextDouble();
        sc.nextLine();
        String string = sc.nextLine();

        System.out.println("String: " + string);
        System.out.println("Double: " + numberDouble);
        System.out.println("Int: " + numberInt);
        sc.close();
    }
}