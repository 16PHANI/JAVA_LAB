import java.util.*;
public class Tester
{
    public static void main(String args[])//main 
    {
        int n1,n2,sum,diff,multi,divi;
        System.out.print("Enter n1 : ");
        Scanner obj=new Scanner(System.in);
        n1=obj.nextInt();
        System.out.print("Enter n2 : ");
        n2=obj.nextInt();
        sum=Utility.addNumbers(n1,n2);
        diff=Utility.diffNumbers(n1, n2);
        multi=Utility.proNumbers(n1, n2);
        divi=Utility.diviNumbers(n1, n2);
        System.out.println("Sum of "+n1+" and "+n2+" is : "+sum);
        System.out.println("Subtraction of "+n1+" and "+n2+" is : "+diff);
        System.out.println("Product of "+n1+" and "+n2+" is : "+multi);
        System.out.println("Division of "+n1+" and "+n2+" is : "+divi);
        obj.close();
    }
}
