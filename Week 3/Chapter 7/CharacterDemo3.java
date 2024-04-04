import java.util.Scanner;

public class CharacterDemo3 
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

        
    }
}
