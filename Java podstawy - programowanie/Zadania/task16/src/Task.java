import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int s = 1;
        for (int i = num; i > 0; i--) {
            s = s * i;
        }
        System.out.println(s);
    }
}