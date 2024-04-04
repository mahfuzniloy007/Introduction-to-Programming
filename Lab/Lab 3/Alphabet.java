public class Alphabet 
{
    public static void main(String[] args) 
    {
        //UpperCase Alphabets
        System.out.print("Uppercase Alphabets: ");
        for (char ch = 'A'; ch <= 'Z'; ch++) 
        {
            System.out.print(ch + " ");
        }
        System.out.println();
        //LowerCase Alphabets
        System.out.print("Lowercase Alphabets: ");
        for (char ch = 'a'; ch <= 'z'; ch++) 
        {
            System.out.print(ch + " ");
        }
        System.out.println();
        //Uppercase Alphabets in Reverse
        System.out.print("Uppercase Alphabets in Reverse: ");
        for (char ch = 'Z'; ch >= 'A'; ch--) 
        {
            System.out.print(ch + " ");
        }
        System.out.println();
        //Lowercase Alphabets in Reverse
        System.out.print("Lowercase Alphabets in Reverse: ");
        for (char ch = 'z'; ch >= 'a'; ch--) 
        {
            System.out.print(ch + " ");
        }
    }
}
