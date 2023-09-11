import java.util.*;
public class MatrixOperations
{
    public static void main(String args[])
    {
        int rows, columns, i, j;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the matrices : ");
        rows = in.nextInt();
        columns = in.nextInt();
        int matrix1[][] = new int[rows][columns];
        int matrix2[][] = new int[rows][columns];
        int sum[][] = new int[rows][columns];
        int sub[][] = new int[rows][columns];
        int mul[][] = new int[rows][columns];
        System.out.println("Enter the elements of matrix1 : ");
        for (i = 0; i < rows; i++)
        {
            for (j = 0; j < columns; j++)
            {
                matrix1[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix2 : ");
        for (i = 0; i < rows; i++)
        {
            for (j = 0; j < columns; j++)
            {
                matrix2[i][j] = in.nextInt();
            }
        }
        for (i = 0; i < rows; i++)
        {
            for (j = 0; j < columns; j++)
            {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for (i = 0; i < rows; i++)
        {
            for (j = 0; j < columns; j++)
            {
                sub[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        for (i = 0; i < rows; i++)
        {
            for (j = 0; j < columns; j++)
            {
                mul[i][j] = 0;
                for (int k = 0; k < columns; k++)
                {
                    mul[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("ADDITION of entered matrices :- ");
        for (i = 0; i < rows; i++)
        {
            for (j = 0; j < columns; j++)
            {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("SUBTRACTION of entered matrices :- ");
        for (i = 0; i < rows; i++)
        {
            for (j = 0; j < columns; j++)
            {
                System.out.print(sub[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("MULTIPLICATION of entered matrices :- ");
        for (i = 0; i < rows; i++)
        {
            for (j = 0; j < columns; j++)
            {
                System.out.print(mul[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
