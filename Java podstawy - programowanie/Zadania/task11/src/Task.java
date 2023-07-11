import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String textFinal = "";
        if (text.length() <= 3) {
            textFinal = text.toUpperCase();
        } else {
            for (int i = 0; i < text.length(); i++) {
                String lastText = "";
                String firstText = "";
                if (i == text.length() - 1 || i == text.length() - 2 || i == text.length() - 3) {
                    lastText = lastText.concat(String.valueOf(text.charAt(i)));
                } else {
                    firstText = firstText.concat(String.valueOf(text.charAt(i)));
                }
                textFinal = textFinal.concat(firstText);
                lastText = lastText.toUpperCase();
                textFinal = textFinal.concat(lastText);

            }
        }
        System.out.println(textFinal);
    }
}