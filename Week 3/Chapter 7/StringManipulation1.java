public class StringManipulation1 
{
    public static void main(String[] args) 
    {
        String aGreeting1 = "      Hello World! Welcome to the World.      ";
        String aGreeting2 = "I hope you love it";
        String aGreeting3 = aGreeting1+ " " + aGreeting2;
        String aGreeting4 = aGreeting1.trim()+ " " + aGreeting2;

        // System.out.println(aGreeting1+ " " + aGreeting2);
        System.out.println(aGreeting3);
        System.out.println();
        System.out.println(aGreeting4);

    }
}
