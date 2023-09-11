import java.util.*;
public class GCD
{
    public static void main(String[] args)
    {
        int n1, n2, i, gcd = 0;
        // Input the two numbers
        System.out.print("Enter n1 and n2:");
        Scanner s = new Scanner(System.in);
        n1 = s.nextInt();
        n2 = s.nextInt();
        // Find the GCD using a loop
        for (i = 1; i <= n1 && i <= n2; ++i)
        {
            if (n1 % i == 0 && n2 % i == 0)
            {
                gcd = i;
            }
        }
        // Output the GCD
        System.out.println("GCD of " + n1 + " and " + n2 + " is " + gcd);
    }
}
