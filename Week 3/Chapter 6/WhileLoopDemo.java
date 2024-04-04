public class WhileLoopDemo 
{
    public static void main(String[] args) 
    {
        int count = 1;
        while (count<=10) 
        {
            System.out.println("This is While Loop " +count);
            count++;
            // count = count+1;
            // count = count++;
        }
        System.out.println();
        count =10;
        while (count>=0) 
        {
            System.out.println("This is While Loop " +count);
            count--;
            // count = count+1;
            
        }
    }
}
