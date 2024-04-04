// import java.util.Scanner;

// public class EvenOdd 
// {
//     public static void main(String[] args) 
//     {
//         Scanner input = new Scanner(System.in);
        
        
//         System.out.print("Enter a number: ");
//         int number = input.nextInt();
        
//         if (number % 2 == 0) 
//         {
//             System.out.println(number+" is an EVEN Number");
//         } 
//         else 
//         {
//             System.out.println(number+" is an ODD Number");
//         }
        
//         input.close();
//     }
// }

import javax.swing.JOptionPane;

public class EvenOdd 
{
    public static void main(String[] args) 
    {
        
        String Value;
        int num;

        Value = JOptionPane.showInputDialog(null, "Please enter value");
        num = Integer.parseInt(Value);

        if (num % 2 == 0)
        {
            javax.swing.JOptionPane.showMessageDialog(null, num +" is an EVEN number");
        }
        else
        {
            javax.swing.JOptionPane.showMessageDialog(null, num +" is an ODD number");
        }
    }
}
