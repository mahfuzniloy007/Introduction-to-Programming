
public class PackageDemo
{
    public static void main(String[] args)
    {
        int result1;
        int result2;
        int result3;


        int number1 = 10;
        int number2 = 30;
        // int number3 = 50;

        result1= MyAdditionSubstraction.sum(number1, number2);
        result2= MyAdditionSubstraction.sub(number1, number2);
        result3= MyAdditionSubstraction.mul(number1, number2);

        System.out.println("the sum of"+ number1+"and"+number2+"=" +result1);
        System.out.println("the div of"+ number1+"and"+number2+"=" +result2);
        System.out.println("the mul of"+ number1+"and"+number2+"=" +result3);

    }
}