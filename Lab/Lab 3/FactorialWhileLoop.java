import java.util.Scanner;

public class FactorialWhileLoop 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the non-negative number to process its factorial: ");
        int number = input.nextInt();

        int fact = 1;
        int i = 1;

        while (i<=number) 
        {
            fact = fact*i;
            i++;

        }
        System.out.print("The Factorial of " + number + "! = ");
        for (int j = number; j >= 1; j--) 
        {
            if (j == 1) 
            {
                System.out.print(j + " = ");
            } 
            else 
            {
                System.out.print(j +" x ");
            }
        }
        System.out.println(fact);
    }    
}