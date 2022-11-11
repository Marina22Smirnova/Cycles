import java.util.Scanner;

public class Home1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое целое число: ");
        int number = sc.nextInt();
        System.out.println("Введите количество повторений: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
           System.out.print(number + " ");
        }
    }
}
