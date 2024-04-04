import java.util.Scanner;
public class UsingData
{
    public static void main(String[] args) 
    {
        int value1,value2;

        Scanner input1 = new Scanner(System.in);
        
        System.out.print("Input 1st integer: ");
        value1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);

        System.out.print("Input 2nd integer: ");
        value2 = input2.nextInt();


        System.out.println("Sum of two integers: " + (value1+value2));
        System.out.println("Difference of two integers: "+ (value1-value2));
        System.out.println("Product of two integers: "+ (value1*value2));
        System.out.println("Average of two integers: "+ (value1+value2)/2);
        System.out.println("Distance of two integers: "+ Math.abs(value1-value2));
        System.out.println("Max integer: " + Math.max(value1,value2) );
        System.out.println("Min integer: " + Math.min(value1,value2));
    }
}