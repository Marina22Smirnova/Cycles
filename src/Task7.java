import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите последовательность целых чисел, оканчивающуюся нулем: ");
        int sum = 0;
        int number;
        int count = 0;
        do {
            number = sc.nextInt();
            sum += number;
            count++;
        }
        while (number != 0);
        System.out.printf("Сумма всех чисел последовательнсти равна %d \n",sum);
        System.out.printf("Количество всех чисел последовательности равно %d \n",count);
    }
}
