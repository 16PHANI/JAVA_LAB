import java.util.*;
public class SumofEvenOddNo
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Size of an Array : ");
        int n=obj.nextInt();
        int[] numbers=new int[n];
        System.out.println("Enter  elements of the Array : ");
        for(int i=0;i<n;i++)
        {
            numbers[i]=obj.nextInt();
        }
        int sumEven=0;
        int sumOdd=0;
        for(int number : numbers)
        {
            if(number %2==0)
            {
                sumEven+=number;
            }
            else
            {
                sumOdd+=number;
            }
        }
        System.out.println("Sum of even numbers is : "+sumEven);
        System.out.println("Sum of odd numbers is : "+sumOdd);
        obj.close();
    }
}
