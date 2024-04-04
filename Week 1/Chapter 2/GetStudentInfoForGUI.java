import javax.swing.JOptionPane;

public class GetStudentInfoForGUI
{
    public static void main(String[] args)
    {
        String name;
        String age;

        //ask for input
        name =JOptionPane.showInputDialog(null, "Please enter your name: ");
        age =JOptionPane.showInputDialog(null, "Please enter your age: ");

        // System.out.print("Your name is " + name + " and Your age is " + age);
        JOptionPane.showMessageDialog(null, "Your name is " + name + " and Your age is " + age);
    }
}