import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x <= y && (x >= 0 && x <= 100) && (y >= 0 && y <= 100)) {
            for (int i = x; i < y + 1; i++) {
                if (i % 7 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}