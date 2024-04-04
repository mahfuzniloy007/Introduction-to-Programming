public class Sorting 
{
    public static void main(String[] args) 
    {
        int[] numbers = {10, 5, 15, 30, 47};
        for (int i= 0; i < numbers.length ; i++)
        {
            for (int j = i+1; j < numbers.length; j++) 
            {
                
                if (numbers[i]>numbers[j]) 
                {
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        for(int number : numbers)
        {
            System.out.print(number + " ");
        }
    }
}
