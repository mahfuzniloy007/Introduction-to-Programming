import java.util.Scanner;

public class UserInput
{
    public static void main(String[] arg)
    {
        String name;
        int age;
        Scanner myInputValue = new Scanner(System.in);

        //ask for input
        System.out.println("Please enter your name: ");
        name = myInputValue.nextLine();

        System.out.println("Please enter your age: ");
        age = myInputValue.nextInt();


        System.out.println("Your name is " + name + " and Your age is " + age);
    }
}