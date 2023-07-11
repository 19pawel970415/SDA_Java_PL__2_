import java.util.ArrayList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        ArrayList<Integer> numbers = new ArrayList();
        do {
            number = scanner.nextInt();
            numbers.add(number);
        } while (number != 0);
        int max = numbers.get(0);
        int min = numbers.get(0);
        for (int n :
                numbers) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        System.out.println(max + min);
        System.out.println((float)(max + min) / 2);
    }
}