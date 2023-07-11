import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        text = text.toLowerCase();
        boolean isPol = true;
        String textNoSpaces = text.replaceAll("\\s+", "");
        for (int i = 0; i < textNoSpaces.length(); i++) {
            if (textNoSpaces.charAt(i) == textNoSpaces.charAt(textNoSpaces.length() - i - 1)) {
                isPol = true;
            } else {
                isPol = false;
                break;
            }
            }
        System.out.println(isPol);

        }
    }