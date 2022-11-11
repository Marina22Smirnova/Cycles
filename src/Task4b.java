import java.util.Scanner;

public class Task4b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение a: ");
        int a = sc.nextInt();
        System.out.println("Введите значение b: ");
        int b = sc.nextInt();
        int sum = 0;

        if (a <= b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            System.out.println("Сумма a и b равна " +sum);
        }
        else{
            System.out.println("а не должно быть меньше b");
        }
    }
}
