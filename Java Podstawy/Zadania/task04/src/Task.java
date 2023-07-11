import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        int numberOfInstallments = scanner.nextInt();
        if (amount < 100 || amount > 10000) {
            amount = 5000;
        }
        if (numberOfInstallments < 6 || numberOfInstallments > 48) {
            numberOfInstallments = 36;
        }
        if (numberOfInstallments <= 12) {
            System.out.println(amount * 1.025 / numberOfInstallments);
        }
        if (numberOfInstallments > 12 && numberOfInstallments <= 24) {
            System.out.println(amount * 1.05 / numberOfInstallments);
        }
        if (numberOfInstallments > 24) {
            System.out.println(amount * 1.1 / numberOfInstallments);
        }
    }
}