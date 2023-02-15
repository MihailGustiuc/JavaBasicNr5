package Task3;

public class SeriesSum {
    public static void main(String[] args) {
        int n = 49;
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (double) (2 * i - 1) / (2 * i + 1);
        }
        System.out.println("The sum of the series is: " + sum);
    }
}
