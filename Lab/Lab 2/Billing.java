import java.util.Scanner;

public class Billing
{
    public static double computeBill(double price)
    {
        double total_due = price+(price*0.08);
        return total_due;
    }

    public static double computeBill(double price, int quantity)
    {
        double total_due;
        total_due = (price*quantity)+(price*0.08);
        return total_due;
    }

    public static double computeBill(double price, int quantity,double CouponValue)
    {
        double total_due;
        total_due = (((price*quantity)-CouponValue))+(price*0.08);
        return total_due;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of one photo book($) - ");
        double price = input.nextDouble();

        System.out.print("Enter the Quantity - ");
        int quantity = input.nextInt();

        System.out.print("Enter the Coupon Value - ");
        double CouponValue = input.nextDouble();

        //For One Parameter
        double total1 = Billing.computeBill(price);
        System.out.println("The total due for one photo book - $" +total1);

        //For Two Parameter
        double total2 = Billing.computeBill(price,quantity);
        System.out.println("The total due for " +quantity+" photo books - $" +total2);

        //For Three Parameter
        double total3 = Billing.computeBill(price,quantity,CouponValue);
        System.out.println("The total due for " +quantity+" photo books with a $" +CouponValue+" Coupon - $" +total3);

        input.close();
    }
}