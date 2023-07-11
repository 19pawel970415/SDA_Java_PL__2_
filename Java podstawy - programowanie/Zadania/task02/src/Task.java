import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        if (num < 90 || num > 110) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}