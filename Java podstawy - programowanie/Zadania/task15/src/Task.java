import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;

        if (a > b) {
            while (a >= b) {
                c = a - b;
                a = c;
            }
            System.out.println(c);
        } else if (a < b) {
            while (b >= a) {
                c = b - a;
                b = c;
            }
            System.out.println(c);
        } else {
            System.out.println(0);
        }
    }
}