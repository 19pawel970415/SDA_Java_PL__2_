import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        do {
            num = scanner.nextInt();
            sum = sum + num;
        } while (num != 0);
        System.out.println(sum);
    }
}