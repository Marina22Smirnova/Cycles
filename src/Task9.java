public class Task9 {

    public static void main(String[] args) {
        precondition();
        System.out.println(" ");
        cond();
    }
        public static void precondition() {
            int n = 10;
            while (n <= 30) {
                System.out.println(n++);
            }
        }
            public static void cond() {
                int a = 10;
                do {
                    System.out.println(a++);
                }
                while (a <= 30);
            }
        }