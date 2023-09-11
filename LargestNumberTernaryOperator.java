import java.util.*;
public class LargestNumberTernaryOperator
{
    public static void main(String[] args)
    {
        int a, b, c, large;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        a = sc.nextInt();
        System.out.print("Enter the second number : ");
        b = sc.nextInt();
        System.out.print("Enter the third number : ");
        c = sc.nextInt();
        large = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        System.out.print("The Largest number is : " + large);
    }
}
