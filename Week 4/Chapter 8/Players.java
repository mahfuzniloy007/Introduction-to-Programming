import java.util.Scanner;

public class Players 
{
    public static void main(String[] args) 
    {
        String[] nameOfPlayers = {"Messi", "Neymar", "Ronaldo", "Sakib", "Mbappe"};
        int[] jerseyNumber = {10, 11, 7, 75, 8};
        String[] roleOfPlayers = {"Playmaker", "Winger", "Striker", "All-Rounder", "Winger"};

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Jersey and I will get the name and role>> ");
        int numberProvided = input.nextInt();
        boolean found = false;

        for (int i = 0; i < jerseyNumber.length; i++) 
        {
            if (numberProvided == jerseyNumber[i]) 
            {
                String yourName = nameOfPlayers[i];
                String yourRole = roleOfPlayers[i];
                System.out.println("The Name is " +yourName+" and your Role is " +yourRole);
                found = true;
                break;
            }
        }
        if (found == false) 
        {
            System.out.println("The Jersey is not in our team");
        }
    }
}
