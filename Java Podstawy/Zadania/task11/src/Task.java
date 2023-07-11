import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("Przerywam pracę");
        } else {
            int counter = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.println("Tak");
            } else {
                System.out.println("Nie");
            }
        }
    }
}