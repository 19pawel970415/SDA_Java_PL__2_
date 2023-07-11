import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Task {
    public static void main(String[] args) {
        // możesz tutaj wywołać metodę w celu testowania
    }

    public static int[] calculateDifference(String dateA, String dateB) {

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy::MM::dd");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM--yyyy-dd");


        LocalDate localDate1 = LocalDate.parse(dateA, formatter1);
        LocalDate localDate2 = LocalDate.parse(dateB, formatter2);


        Period period = Period.between(localDate1, localDate2);


        int[] difference = {period.getYears(), period.getMonths(), period.getDays()};
        return difference;
    }
}