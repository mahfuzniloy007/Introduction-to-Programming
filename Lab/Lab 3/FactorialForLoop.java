import java.util.Scanner;

public class FactorialForLoop 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the non-negative number to process its factorial: ");
        int number = input.nextInt();

        int fact = 1;
        for (int i = 1; i <=number; i++) 
        {
            fact = fact*i;
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
