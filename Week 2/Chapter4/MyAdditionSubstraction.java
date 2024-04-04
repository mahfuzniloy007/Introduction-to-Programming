package Chapter4;

public class MyAdditionSubstraction
{
    public static int sum(int a, int b, int c) 
    {
        int first = a;
        int second = b;
        int third = c;
        int sum = first+second+third;
        
        return sum;
    }

    public static int add(int a, int b, int c) 
    {
        int sum = a + b + c;        
        return sum;
    }

    public static int sub(int a, int b) 
    {
        int first = a;
        int second = b;
        int different = first+second;
        
        return different;
    }

    public static int mul(int a, int b) 
    {
        int first = a;
        int second = b;
        int product = first*second;
        
        return product;
    }
}