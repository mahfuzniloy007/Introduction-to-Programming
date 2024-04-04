public class DoWhileLoop {
    public static void main(String[] args) 
    {
        int count = 1;
        do 
        {
            System.out.println("This is While Loop " +count);
            count++;
            // count = count+1;
            // count = count++;
        }
        while (count<=10);
    }
}