import java.util.*;
public class FibonacciSeries
{
        public static void main(String[] args)
    {
        int n, firstTerm = 0, secondTerm = 1, nextTerm = 0;
        // Input the range of the Fibonacci series
        System.out.print("Enter Fibonacci Series range: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        // Generate and print the Fibonacci series
        System.out.print("Fibonacci Series up to " + n + ": ");
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(firstTerm + " ");
            // Calculate the next term in the series
            nextTerm = firstTerm + secondTerm;
            // Update the values of the previous two terms
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}


