import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        if (x == 0) {
            System.out.print(0);
            System.out.print(" ");
        } else if (x > 0) {
            for (int i = x; i > -1; i--) {
                System.out.print(i);
                System.out.print(" ");
            }
        } else {
            for (int i = x; i < 1; i++) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}