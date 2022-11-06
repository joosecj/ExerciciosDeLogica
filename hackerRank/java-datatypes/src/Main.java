import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            try {
                long numbs = sc.nextLong();
                System.out.println(numbs + " can be fitted in:");
                if (numbs >= Byte.MIN_VALUE && numbs <= Byte.MAX_VALUE)
                    System.out.println("* byte\n* short\n* int\n* long");
                else if (numbs >=Short.MIN_VALUE && numbs <= Short.MAX_VALUE)
                    System.out.println("* short\n* int\n* long");
                else if (numbs >=Integer.MIN_VALUE && numbs <= Integer.MAX_VALUE)
                    System.out.println("* int\n* long");
                else
                    System.out.println("* long");
            }
            catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}