import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        if (N >= 2 && N <= 5) {
            System.out.println((N % 2 == 0 ? "Not Weird" : "Weird"));
        } else if (N <= 20) {
            System.out.println((N % 2 == 0 ? "Weird" : "Not Weird"));
        } else if (N <= 100){
            System.out.println((N % 2 == 0 ? "Not Weird" : "Weird"));
        }

        bufferedReader.close();
    }
}