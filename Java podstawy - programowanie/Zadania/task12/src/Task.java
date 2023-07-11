import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        text = text.replaceAll("kurka wodna","***");
        text = text.replaceAll("motyla noga","***");
        text = text.replaceAll("psiakrew","***");
        System.out.println(text);
    }
}