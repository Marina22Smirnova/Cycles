public class Task12 {

    public static void main(String[] args) {
        double sum = 1000;
        double percent = 0.02;
        int count = 0;

        while (sum * percent < 30 ){
            sum+=sum*percent;
            count++;
        }
        System.out.println(sum*percent + " "+ count);
        
    }
}
