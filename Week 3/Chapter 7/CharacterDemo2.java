import java.util.Scanner;

public class CharacterDemo2 
{
    public static void main(String[] args) 
    {
        String aGretting1;
        String aGretting2;
        String aGretting3;

        aGretting1="Hello";
        aGretting2="Hello";

        if (aGretting1==aGretting2) {
            System.out.println("In 1st Check. They are the same.");
        }
        else
        {
            System.out.println("In 1st Check. They are not the same.");
        }

        Scanner KeyboardInput = new Scanner(System.in);
        System.out.print("Please enter Hello - ");
        aGretting3 =  KeyboardInput.nextLine();

        if (aGretting1==aGretting3) {
            System.out.println("In 2nd Check. They are the same.");
        }
        else
        {
            System.out.println("In 2nd Check. They are not the same.");
        }

        
    }
}
