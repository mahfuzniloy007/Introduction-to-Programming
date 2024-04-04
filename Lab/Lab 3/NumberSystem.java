import java.util.Scanner;

public class NumberSystem 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the non-negative number for binary conversion: ");
        int value = input.nextInt();

        int originalValue = value;

        String rslt = "";

        while (value>0) 
        {
            int remainder = value%2;
            rslt = remainder + rslt;
            value = value/2;
        }

        System.out.println("The binary conversion of " + originalValue + " is = " + rslt);
    }
}
