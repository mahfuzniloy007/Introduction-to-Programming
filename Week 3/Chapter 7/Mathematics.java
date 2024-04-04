import Math.Calculation;

public class Mathematics {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 =15;
        int result1 = Calculation.addition(num1, num2);
        int result2 = Calculation.subtract(num1, num2);

        System.out.println(num1 + "+" +num2 +" = " +result1);
        System.out.println(num1 + "-" +num2 + " = " +result2);
    }
}
