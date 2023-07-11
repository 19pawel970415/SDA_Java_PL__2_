import java.util.Locale;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int number = scanner.nextInt();
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        int[] charsNums = new int[text.length()];
        for (int i = 0; i < text.length(); i++) {
            charsNums[i] = chars[i];
        }

        int charsNumsFinal[] = new int[charsNums.length];
        for (int i = 0; i < text.length(); i++) {
            if (charsNums[i] <= 122 && charsNums[i] >= 97 || charsNums[i] <= 90 && charsNums[i] >= 65) {
                int current = charsNums[i] + number;
                if (current > 122) {
                    current = current - 123;
                    charsNumsFinal[i] = 97 + current;
                } else {
                    charsNumsFinal[i] = charsNums[i] + number;
                }
            } else {
                charsNumsFinal[i] = charsNums[i];
            }
        }
        for (int i : charsNumsFinal) {
            System.out.print((char) i);
        }

    }
}