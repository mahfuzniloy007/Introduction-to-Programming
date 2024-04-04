import java.util.Scanner;

public class Patterns 
{
    public static void main(String[] args) 
    {
        int width, height;
        Scanner KeyboardInput = new Scanner(System.in);
        
        System.out.print("Enter the Width - ");
        width = KeyboardInput.nextInt();

        System.out.print("Enter the Height - ");
        height = KeyboardInput.nextInt();

        drawPattern(width,height);
    }

    public static void drawPattern(int width, int height) 
    {
        for (int i = 1; i <= width; i++) 
        {
            for (int j = 1; j <= height; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
