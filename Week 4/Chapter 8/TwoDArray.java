public class TwoDArray
{
    public static void main(String [] arg)
    {
        final int ROW = 3;
        final int COLUMN =4;
        
        int[][] matrix = new int[ROW][COLUMN];;
        
        matrix[0] [0] = 1;
        matrix[0] [1] = 2;
        matrix[0] [2] = 3;
        matrix[0] [3] = 4;

        matrix[1] [0] = 5;
        matrix[1] [1] = 6;
        matrix[1] [2] = 7;
        matrix[1] [3] = 8;


        matrix[2] [0] = 9;
        matrix[2] [1] = 1;
        matrix[2] [2] = 2;
        matrix[2] [3] = 3;


        for (int i = 0; i < ROW ; i++)
        {
            for(int j = 0; j < COLUMN; j++ )
            {
                System.out.print(matrix[i] [j] + " ");
            }
            System.out.println();
        }    
        
        int[][] matrix2 = 
        {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 1, 2, 3}
        };

        int[][] matrix3 = { {1, 2, 3, 4},  {5, 6, 7, 8}, {9, 1, 2, 3}};
        
        System.out.println();

        for (int i = 0; i < ROW ; i++)
        {
            for(int j = 0; j < COLUMN; j++ )
            {
                System.out.print(matrix2[i] [j] + " ");
            }
            System.out.println();
        }    
    }
}