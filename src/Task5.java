import java.util.Scanner;

public class Task5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;

        for(int  i= 0; i < n; i++){
            double number = sc.nextDouble();
            sum+=number;
        }
        System.out.println(sum/n);
    }
}

