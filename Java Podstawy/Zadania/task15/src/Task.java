import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\p{Punct}");

        String textNoPunct = text.replaceAll(pattern.pattern(), "");

        String textNoPunctLowerCase = textNoPunct.toLowerCase();

        String[] words = textNoPunctLowerCase.split(" ");

        Set<String> finalWordsCount = new HashSet<String>();
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            int currentWordCounter = 0;
            for (String word : words) {
                if (currentWord.equals(word)) {
                    currentWordCounter++;
                }
            }
            finalWordsCount.add(String.valueOf(words[i] + " - " + currentWordCounter));
        }
        List list = new ArrayList<>(finalWordsCount);

        List sortedList = (List) list.stream()
                .sorted()
                .collect(Collectors.toList());
        for (Object s : sortedList) {
            System.out.println(s);
        }
    }
}