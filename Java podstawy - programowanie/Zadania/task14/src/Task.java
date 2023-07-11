import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        System.out.println(a);

    }
}