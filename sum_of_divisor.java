import java.util.Scanner;

public class sum_of_divisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { 
                sum += i;
            }
        }

        System.out.println("Sum of divisors: " + sum);
    }
}
