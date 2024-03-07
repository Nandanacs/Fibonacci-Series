package series;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the limit for Fibonacci series: ");
		        int limit = scanner.nextInt();
		        scanner.close();

		        System.out.print("Fibonacci series up to " + limit + ": ");
		        int first = 0, second = 1;
		        System.out.print(first + ", " + second);

		        while (first + second <= limit) {
		            int next = first + second;
		            System.out.print(", " + next);
		            first = second;
		            second = next;
		        }
		        System.out.println();
		    }
		}



