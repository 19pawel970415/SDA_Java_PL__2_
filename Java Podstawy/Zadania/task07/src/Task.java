import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int p = 1;
        int x = 1;
        while (p <= n) {
            System.out.println(p);
            p = (int) Math.pow(2, x);
            x++;
        }
    }
}