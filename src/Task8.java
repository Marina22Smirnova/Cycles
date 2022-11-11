import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int naturalNumber = sc.nextInt();
        int threeCount = 0;
        int lastDigit = naturalNumber % 10;
        int lastDigitCount = 0;
        int evenDigitsCount = 0;
        int sum = 0;
        int product = 1;
        int nullsAndFiveCount = 0;

        while (naturalNumber > 0) {
            int digit = naturalNumber % 10;
            naturalNumber /= 10;

            if (digit == 3) {
                threeCount++;
            }

            if (digit == lastDigit) {
                lastDigitCount++;
            }

            if (digit % 2 == 0) {
                evenDigitsCount++;
            }

            if (digit > 5) {
                sum += digit;
            }

            if (digit < 7) {
                product *= digit;
            }

            if (digit == 0 || digit == 5) {
                nullsAndFiveCount++;
            }
            if (product == 1) {
                product = 0;
            }
        }
        System.out.println("Количество цифр 3 равно "+threeCount);
        System.out.println("Количество повторений последней цифры равно"+lastDigitCount);
        System.out.println("Количество четных цифр равно "+evenDigitsCount);
        System.out.println("Сумма цифр больших 5 равна "+sum);
        System.out.println("Произведение цифр меньших 7 равно "+product);
        System.out.println("Количество повторений цифр 5 и 0 равно "+nullsAndFiveCount);
    }
}

