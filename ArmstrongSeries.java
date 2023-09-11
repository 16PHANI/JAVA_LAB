import java.util.*;
public class ArmstrongSeries
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n for finding armstrong series : ");
        int limit = scanner.nextInt();
        System.out.println("Armstrong numbers up to " + limit + " are:");
        for (int number = 1; number <= limit; number++)
        {
            if (isArmstrong(number)) {
                System.out.print(number + " ");
            }
        }
    }
    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int number)
    {
        int originalNumber, remainder, result = 0;
        originalNumber = number;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, countDigits(number));
            originalNumber /= 10;
        }
        return result == number;
    }
    // Function to count the number of digits in a number
    public static int countDigits(int number)
    {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}

