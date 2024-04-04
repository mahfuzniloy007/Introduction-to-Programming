ublic class Array
{
    public static void main(String [] arg)
    {
        final int COUNT = 5;
        int number1 = 10;
        int number2 = 20;
        int number3 = 30;
        int number4 = 40;
        int number5 = 50;
        int sum = number1 + number2 + number3 + number4 + number5;

        System.out.println(number1 + " + " + number2 + " + " + number3 + " + " + number4 + " + " + number5 + "=" + sum);

        // one way to declare an array
        //int[] numbers;
        int[] numbers = {10, 20, 30, 40, 50};

        sum = 0;
        for (int i= 0; i < COUNT ; i++)
        {
            sum = sum + numbers[i];
            System.out.print(numbers[i] + " + ");
        }
        System.out.print( " = " + sum);

        
         //to Initialize my array
        int[] scores;
        scores = new int[5];  
        scores[0] = 15;
        scores[1] = 25;
        scores[2] = 35;
        scores[3] = 45;
        scores[4] = 55;


         sum = 0;
         for (int i= 0; i < COUNT ; i++)
         {
             sum = sum + scores[i];
             System.out.print(scores[i] + " + ");
         }
         System.out.print( " = " + sum);
 
        
    }
}