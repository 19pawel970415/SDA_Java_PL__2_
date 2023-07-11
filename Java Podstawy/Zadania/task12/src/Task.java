import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] numbers = Arrays
                .stream(args)
                .mapToInt(Integer::parseInt)
                .toArray();

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;
        int counter7 = 0;
        int counter8 = 0;
        int counter9 = 0;
        int counter10 = 0;
        for (int number : numbers) {
            switch (number) {
                case 10:
                    counter10++;
                    break;
                case 1:
                    counter1++;
                    break;
                case 2:
                    counter2++;
                    break;
                case 3:
                    counter3++;
                    break;
                case 4:
                    counter4++;
                    break;
                case 5:
                    counter5++;
                    break;
                case 6:
                    counter6++;
                    break;
                case 7:
                    counter7++;
                    break;
                case 8:
                    counter8++;
                    break;
                case 9:
                    counter9++;
                    break;
            }
        }
        System.out.println("1 - " + String.valueOf(counter1));
        System.out.println("2 - " + String.valueOf(counter2));
        System.out.println("3 - " + String.valueOf(counter3));
        System.out.println("4 - " + String.valueOf(counter4));
        System.out.println("5 - " + String.valueOf(counter5));
        System.out.println("6 - " + String.valueOf(counter6));
        System.out.println("7 - " + String.valueOf(counter7));
        System.out.println("8 - " + String.valueOf(counter8));
        System.out.println("9 - " + String.valueOf(counter9));
        System.out.println("10 - " + String.valueOf(counter10));
    }
}