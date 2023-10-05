import java.util.*;
public class Ternary
{
    public static void main(String args[])
    {
        int a,b,c,large;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        a=obj.nextInt();
        System.out.println("Enter the second number : ");
        b=obj.nextInt();
        System.out.println("Enter the third number : ");
        c=obj.nextInt();
        large=c>(a>b ? a:b)?c:((a>b) ? a:b);
        System.out.println("The Large number is : "+large);
        obj.close();
    }
}
