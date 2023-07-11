import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {
    public static void main(String[] args) {
        // możesz tutaj wywołać metodę w celu testowania
    }

    public static LocalDate toLocalDate(String pattern, String input) {

        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        localDate = LocalDate.parse(input, formatter);
        return localDate;
    }
}