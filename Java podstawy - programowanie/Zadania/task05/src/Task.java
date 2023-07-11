import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Float num = scanner.nextFloat();
        System.out.println(num.intValue());
        System.out.println(Math.round(num));
        System.out.println(Math.ceil(num));
    }
}