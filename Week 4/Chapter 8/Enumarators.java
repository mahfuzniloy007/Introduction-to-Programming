import java.util.*;

public class Enumarators 
{
    public static void main(String[] args) 
    {
        enum Months {JAN, FEB, MAR, APR, MAY, JUN, JULY, AUG, SEP, OCT, NOV, DEC};
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter The Month Name - ");
        String monthEntry = input.nextLine();
        monthEntry = monthEntry.toUpperCase(); //it will convert input to uppercase

        Months BirthMonth = Months.valueOf(monthEntry);
        int position = BirthMonth.ordinal();

        for (Months eachMonth : Months.values()) 
        {
            System.out.print(eachMonth + ", ");
        }
        System.out.println();
        System.out.println("Position Of The Month is " + (position+1));
    }
}
