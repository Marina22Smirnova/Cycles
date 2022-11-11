public class Task6 {

    public static void main(String[] args) {
        System.out.println(fib(4));
        checkIfEvens(fibnumbers(5));
    }

    public static int fib(int k) {
        int number = 0;
        if (k == 1 || k == 2) {
            number = 1;
        } else {
            number = fib(k - 1) + fib(k - 2);
        }
        return number;
    }

    public static int fibnumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(fib(i) + " ");
            sum+= fib(i);
        }
        return sum;
    }

    public static void checkIfEvens(int sum){
        if (sum%2==0){
            System.out.println("Сумма является четной");
        }else{
            System.out.println("Сумма является нечетной");
        }
    }
}