import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int spaces = size - 1;
        int stars = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces--;
            stars++;
            stars++;
        }
        stars = stars / 2;
        if (stars == 1) {
            System.out.print("#");
        } else {
            for (int i = 0; i < stars - 1; i++) {
                System.out.print(" ");
            }
            System.out.print("#");
        }
    }
}