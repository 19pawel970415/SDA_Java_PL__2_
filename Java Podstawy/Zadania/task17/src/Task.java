import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            String currentChar = String.valueOf(text.charAt(i));
            if (currentChar.equals("(")) {
                counter++;
            }
            if (currentChar.equals(")")) {
                counter--;
            }
        }
        boolean isOk = true;
        if (counter == 0) {
            for (int i = 0; i < text.length(); i++) {
                String currentChar = String.valueOf(text.charAt(i));
                if (currentChar.equals("(")) {
                    counter++;
                }
                if (currentChar.equals(")")) {
                    counter--;
                }
                if (counter < 0) {
                    System.out.println("Błędne sparowanie nawiasów");
                    isOk = false;
                    break;
                }
            }
            if (isOk) {
                System.out.println("OK");
            }
        } else {
            System.out.println("Błędne sparowanie nawiasów");
        }
    }
}