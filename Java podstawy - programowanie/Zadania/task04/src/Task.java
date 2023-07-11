import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        if (amount > 42 || amount == 13 || amount == 19 || amount == 20 || (amount >= 25 && amount <= 27) || (amount >= 31 && amount <= 34) || (amount >= 37 && amount <= 41)) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}