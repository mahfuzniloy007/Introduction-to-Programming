public class CharacterDemo1
{
    public static void main(String[] args) 
    {
        char aChar1='A';
        char aChar2='b';

        System.out.println("aChar1 is an UpperCase(True or False) - " + Character.isUpperCase(aChar1));
        System.out.println("aChar1 is an UpperCase(True or False) - " + Character.isUpperCase(aChar2));


        System.out.println("aChar1 is a LowerCase(True or False) - " + Character.isLowerCase(aChar1));
        System.out.println("aChar1 is a LowerCase(True or False) - " + Character.isLowerCase(aChar2));
        System.out.println("aChar1 is a LowerCase(True or False) - " + Character.isLowerCase(aChar2));


    }
}