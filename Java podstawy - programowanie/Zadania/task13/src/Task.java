import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstFive = new int[5];
        int[] secondFive = new int[5];
        for (int i = 0; i < firstFive.length; i++) {
            int num = scanner.nextInt();
            firstFive[i] = num;
        }
        for (int i = 0; i < secondFive.length; i++) {
            int num = scanner.nextInt();
            secondFive[i] = num;
        }
        for (int i = 0; i < firstFive.length; i++) {
            for (int j = 0; j < secondFive.length; j++) {
                if (firstFive[i] == secondFive[j]) {
                    System.out.println(firstFive[i]);
                }
            }
        }

    }
}