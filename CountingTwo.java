
import java.util.Scanner;

public class CountingTwo {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int n = scanner.nextInt();

            int count = 0;

            // Iterate through all numbers from 0 to n
            for (int i = 0; i <= n; i++) {
                // Extract each digit of the number
                int num = i;
                while (num > 0) {
                    int digit = num % 10;
                    if (digit == 2) {
                        count++;
                    }
                    num /= 10;
                }
            }

            System.out.println("The number of 2's from 0 to " + n + " is: " + count);
        }
    }


