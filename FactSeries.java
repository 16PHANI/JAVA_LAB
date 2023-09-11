import java.util.*;
public class FactSeries
{
    public static void main(String[] args)
    {
        int i, j, n, fact;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n for finding factorial series: ");
        n = s.nextInt();
        for (i = 1; i <= n; i++)
        {
            fact = 1;
            for (j = 1; j <= i; j++)
            {
                fact = fact * j;
            }
            System.out.println("Factorial of "+ i +" is: " + fact);
        }
    }
}
