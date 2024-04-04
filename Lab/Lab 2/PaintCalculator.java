import java.util.Scanner;

public class PaintCalculator 
{
    public static void main(String[] args) 
    {
        double  length, width, height;
        Scanner input =  new Scanner(System.in);

        System.out.print("Enter Length: ");
        length = input.nextDouble();
        System.out.print("Enter Width: ");
        width = input.nextDouble();
        System.out.print("Enter Height: ");
        height = input.nextDouble();

        double area = CalculateArea(length, width, height);
        double cost = CalculateCost(area);

        System.out.println("The total paint's price is $" +cost);
    }

    public static double CalculateArea(double length, double width, double height)
    {
        double area = ((height*length)*2)+((height*width)*2);
        return area;
    }

    public static double CalculateCost(double area)
    {
        double gallons, price;
        gallons = area/350;
        price = gallons*32;
        return price;
    }
}
