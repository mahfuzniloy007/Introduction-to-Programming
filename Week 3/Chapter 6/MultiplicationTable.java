//Nested Loop

public class MultiplicationTable 
{
    public static void main(String[] args)
    {
        int result;
        for (int i = 1; i <= 12; i++) 
        {
            for (int j = 1; j<=12; j++) 
            {
                result =  i*j;
                System.out.println(i + " * " + j + " = " + result);
            }
            System.out.println();
        }
            
    }
}




// public class MultiplicationTable 
// {
//     public static void main(String[] args)
//     {
//         for (int i = 1; i <= 12; i++) 
//         {
//             int result = i*9;
//             System.out.println(i + " * 9 = " + result);
//         }
//     }
// }
