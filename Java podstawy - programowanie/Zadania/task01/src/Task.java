import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float mph = scanner.nextFloat();
        float kph = 1.6f * mph;
        System.out.println(kph);
    }
}