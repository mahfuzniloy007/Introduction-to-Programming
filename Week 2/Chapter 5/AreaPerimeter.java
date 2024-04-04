// import java.util.Scanner;

// public class AreaPerimeter {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the first value: ");
//         double length = scanner.nextDouble();

//         System.out.print("Enter the second value: ");
//         double width = scanner.nextDouble();

//         calculateAP(length, width);

//         scanner.close();
//     }

//     public static void calculateAP(double length, double width) 
//     {
//         if (length == width) 
//         {
            
//             double area = length * width;
//             System.out.println("The area of the square is " + area);
//         } 
//         else 
//         {
            
//             double perimeter = 2 * (length + width);
//             System.out.println("The perimeter of the rectangle is " + perimeter);
//         }
//     }
// }


import javax.swing.JOptionPane;

public class AreaPerimeter
{
    public static void main(String[] args) 
    {
        String inputvalue;
        int length;
        int width;
        inputvalue = JOptionPane.showInputDialog(null, "Please enter Length");
        length = Integer.parseInt(inputvalue); //for first input

        inputvalue = JOptionPane.showInputDialog(null, "Please enter Width");
        width = Integer.parseInt(inputvalue);
        calculateAP(length, width);
    }

    public static void calculateAP(int length, int width) 
    {
        if (length == width) 
        {
            
            int area = length * width;
            JOptionPane.showMessageDialog(null, "The area of " + length + " and " + width + " is " + area);
        } 
        else 
        {
            
            int perimeter = 2 * (length + width);
            JOptionPane.showMessageDialog(null, "The perimeter of " + length + " and " + width + " is " + perimeter);
        }
    }
}