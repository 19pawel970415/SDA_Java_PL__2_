import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < b) {
            int sum = 0;
            for (int i = a; i <= b; i++) {
                sum = sum + a;
                a++;
            }
            System.out.println(sum);
        } else {
            System.out.println("Robota skończona");
        }
    }
}