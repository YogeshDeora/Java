import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = scanner.nextInt(); 

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int[] fib = new int[n];

        if (n > 0) fib[0] = 0;
        if (n > 1) fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println("Fibonacci Sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}
