import java.util.Scanner;

public class CharacterDemo4
{
    public static void main(String[] args) 
    {
        String aGretting1;
        String aGretting2;

        aGretting1="Hello";


        Scanner KeyboardInput = new Scanner(System.in);
        System.out.print("Please enter Hello - ");
        aGretting2 =  KeyboardInput.nextLine();

        if (aGretting1.equals(aGretting2)) {
            System.out.println("They are the same.");
        }
        else
        {
            System.out.println("They are not the same.");
        }

        String lowerCaseVariable= aGretting2.toLowerCase();
        String upperCaseVariable= aGretting2.toUpperCase();
        int lengthOfString = aGretting2.length();

        System.out.println("Length Of String - " + lengthOfString);
        System.out.println("Convert word you entered to uppercase - " +upperCaseVariable);
        System.out.println("Convert word you entered to lowercase - " +lowerCaseVariable);
    }
}
