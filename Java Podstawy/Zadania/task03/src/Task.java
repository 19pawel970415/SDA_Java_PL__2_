import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = scanner.nextDouble();
        if (income <= 556.02) {
            System.out.println(0);
        } else if (income <= 85528) {
            System.out.println(0.18 * income - 556.02);
        } else {
            System.out.println(14839.02 + 0.32 * (income - 85528));
        }
    }
}