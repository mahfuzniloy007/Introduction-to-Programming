import java.util.Scanner;

public class CharacterDemo7 {
    public static void main(String[] args) 
    {
        String myStatement1;
        String myStatement2;

        myStatement1 = "Welcome To C# Programming.";
        myStatement2 = myStatement1.replace("C#", "JAVA");

        System.out.println("Original Statement is - " +myStatement1);
        System.out.println("Replaced Statement is - " +myStatement2);

        int a = 4;
        String b = "4";
        char c = '4';
        String d = Integer.toString(a);
        int e = Integer.parseInt(b);

        System.out.println(a+10);
        System.out.println(b+10);
        System.out.println(c+10);
        System.out.println(d+10);
        System.out.println(e+10);
    }
}
