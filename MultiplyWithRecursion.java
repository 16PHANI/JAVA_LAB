public class MultiplyWithRecursion
{
    static int multiply(int x, int y)
    {
        if (y == 0)
            return 0;
        if (y > 0)
            return (x + multiply(x, y - 1));
        if (y < 0)
            return -multiply(x, -y);
        return -1;
    }
    public static void main(String[] args)
    {
        int result = multiply(5, -11);
        System.out.println("Result of Multiplication : " + result);
    }
}
