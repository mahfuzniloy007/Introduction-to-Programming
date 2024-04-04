import java.util.Scanner;

public class StringAnalyze 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String ch = input.nextLine();

        int isUpperCase = 0;
        int isLowerCase = 0;
        int isDigit = 0;
        int isWhiteSpace = 0;

        for (int i = 0; i < ch.length(); i++) 
        {
            char CrntCh = ch.charAt(i);
            
            if (Character.isUpperCase(CrntCh)) 
            {
                isUpperCase++;
            }
            else if (Character.isLowerCase(CrntCh)) 
            {
                isLowerCase++;
            }
            else if (Character.isDigit(CrntCh)) 
            {
                isDigit++;
            }
            else if (Character.isWhitespace(CrntCh)) 
            {
                isWhiteSpace++;
            }
        }
        
        System.out.println("Uppercase letters: " + isUpperCase);
        System.out.println("Lowercase letters: " + isLowerCase);
        System.out.println("Digits: " + isDigit);
        System.out.println("Whitespace characters: " + isWhiteSpace);
    }
}
