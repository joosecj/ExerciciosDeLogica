
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

/*        OPÇÃO FLEXÍVEL
        int quantidadeDeNumeros = scanner.nextInt();
        List<Integer> numerosList = new ArrayList<>();
        for(int i = 0; i < quantidadeDeNumeros; i++) {
            int n = scanner.nextInt();
            stdout.add(n);
        }
        stdout.forEach(System.out::println);
 */
        scanner.close();
    }
}