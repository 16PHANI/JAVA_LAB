import java.util.Scanner;
public class Promot
{
    public static void main(String[] args)
    {
        int java, dbms, flat, total;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marks in Java : ");
        java = in.nextInt();
        System.out.print("Enter marks in FLAT : ");
        flat = in.nextInt();
        System.out.print("Enter marks in DBMS : ");
        dbms = in.nextInt();
        total = java + flat + dbms;
        if (java >= 50 && flat >= 50 && dbms >= 50 && total >= 200)
        {
            System.out.println("Promoted");
        } else
        {
            System.out.println("Not Promoted");
        }
    }
}
