package Task1;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, positive = 0, negative = 0, total = 0;
        System.out.println("Enter an integer, the input ends if it is 0:");
        number = input.nextInt();
        while (number != 0) {
            if (number > 0) {
                positive++;
            } else {
                negative++;
            }
            total += number;
            number = input.nextInt();
        }
        System.out.println("The number of positive values is " + positive);
        System.out.println("The number of negative values is " + negative);
        System.out.println("The total is " + total);
    }

}