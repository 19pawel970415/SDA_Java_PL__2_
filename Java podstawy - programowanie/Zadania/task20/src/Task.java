import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String adres = scanner.nextLine();

        String regex = "^http://";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(adres);

        String nowyAdres = matcher.replaceFirst("https://");

        System.out.println(nowyAdres);
    }
}