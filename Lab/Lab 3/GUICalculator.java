import javax.swing.JOptionPane;

public class GUICalculator 
{
    public static void main(String[] args) 
    {
        String input1 = JOptionPane.showInputDialog("Enter the first number");
        int number1 = Integer.parseInt(input1);

        String input2 = JOptionPane.showInputDialog("Enter the second number");
        int number2 = Integer.parseInt(input2);
        
        int addition = add(number1,number2);
        int substraction = sub(number1,number2);

        JOptionPane.showMessageDialog(null, "Addition Result: " + addition + "\n" + "Substraction Result: " + substraction);
    }

    public static int add(int number1, int number2)
    {
        return number1 + number2;
    }

    public static int sub(int number1, int number2)
    {
        return number1 - number2;
    }
}
