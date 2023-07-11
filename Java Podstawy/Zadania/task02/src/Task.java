import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float tempInCelsius = scanner.nextFloat();
        System.out.println(1.8 * tempInCelsius + 32);
    }
}