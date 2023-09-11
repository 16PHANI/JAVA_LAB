import java.util.*;
public class PerfectNumberChecker
{
    public static void main(String[] args)
    {
        int n, sum = 0;
        System.out.print("Enter a number: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (int i = 1; i < n; i++)
        {
            if (n % i == 0)
            {
                sum = sum + i;
            }
        }
        if (sum == n)
        {
            System.out.println(n + " is a perfect number.");
        } else
        {
            System.out.println(n + " is not a perfect number.");
        }
    }
}
