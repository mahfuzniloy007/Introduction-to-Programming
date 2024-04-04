import java.util.Scanner;

public class PasswordValidator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Password: ");
        String password = input.nextLine();
        boolean condition = isValid(password);

        if (condition == true) 
        {
            System.out.println("\"Congratulations! Your password meets the criteria.\"");
        }
        else
        {
            System.out.println("Sorry, your password must:\n- Be at least 8 characters long\n- Contain at least one uppercase letter\n- Contain at least one lowercase letter\n- Contain at least one digit\n- Not contain any whitespace characters\n");
        }

    }

    public static boolean isValid(String password)
    {
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasWhiteSpace = true;
        if (password.length()<8) 
        {
            return false;
        }
        else
        {
            for (int i = 0; i < password.length(); i++) 
            {
                if (Character.isUpperCase(password.charAt(i))) 
                {
                    hasUpperCase =  true;
                }
                else if (Character.isLowerCase(password.charAt(i))) 
                {
                    hasLowerCase =  true;
                }
                else if (Character.isDigit(password.charAt(i))) 
                {
                    hasDigit = true;
                }
                else if (Character.isWhitespace(password.charAt(i))) 
                {
                    hasWhiteSpace = false;
                }
            }
            return hasUpperCase && hasLowerCase && hasDigit && hasWhiteSpace;
        }
    }
}
