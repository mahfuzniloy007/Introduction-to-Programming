public class ScopeDemo
{
    public static void main(String[] args)
    {
        int number = 10;
        System.out.println(number);
        method1();

        System.out.println(number);
        
    }

    public static void method1()
    {
        int number = 20;
        System.out.println(number);
    }
}