import java.util.Scanner;

public class CellPhoneService 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int talkMinutes, textMessages, dataUsed;

        System.out.print("Enter maximum allowance of talk minutes used per month: ");
        talkMinutes = input.nextInt();

        System.out.print("Enter total count of text messages sent per month: ");
        textMessages = input.nextInt();

        System.out.print("Enter maximum gigabytes of data used per month: ");
        dataUsed = input.nextInt();

        if (talkMinutes<500) 
        {
            System.out.println("Recommended Plan - Plan A ($49 per month)");
        }
        else if (talkMinutes<500 && textMessages>0) 
        {
            System.out.println("Recommended Plan - Plan B ($55 per month)");
        }
        else if (talkMinutes>=500 && dataUsed==0) 
        {
            if (textMessages<100) 
            {
                System.out.println("Recommended Plan - Plan C ($61 per month)");
            }
            else if (textMessages>=100) 
            {
                System.out.println("Recommended Plan - Plan D ($70 per month)");
            }
        }
        else if (dataUsed<=3) 
        {
            System.out.println("Recommended Plan - Plan E ($79 per month)");
        }
        else if (dataUsed>=3) 
        {
            System.out.println("Recommended Plan - Plan F ($87 per month)");
        }

        input.close();
    }
}