import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pow = 0;
        for(int i = 0; i < n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            for(int j = 0; j < c;j ++){
                pow = b*(int)Math.pow(2,j);
                a += pow;
                System.out.print(a +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}