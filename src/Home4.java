public class Home4 {

    public static void main(String[] args) {
        sum(4.0);
    }

    public static void sum(double n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double number = 1.0 / i;
            sum += number;
            if (i == n) {
                System.out.println(sum);
            }
        }
    }
}
