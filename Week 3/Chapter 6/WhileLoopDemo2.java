import java.util.Scanner;

public class WhileLoopDemo2 
{
    public static void main(String[] args) {
        int count = 1;
        int maxNumber;
        Scanner KeyboardInput =  new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        maxNumber = KeyboardInput.nextInt();



        while (count<=maxNumber) {
            int threeDivison;
            int fiveDivision;

            threeDivison=count%3;
            fiveDivision=count%5;

            if ((threeDivison==0) && (fiveDivision==0)) {
                System.out.println("WhileLoop #" +count);
                
            }
            count++;
        }
    }
}


// import java.util.Scanner;



// public class WhileLoopDemo2

// {

//     public static void main(String[] args)

//     {

//         int counter = 1;

//         int maxNumber;

//         Scanner KeyboardInput = new Scanner(System.in);



//         System.out.print("Enter the number:");

//         maxNumber = KeyboardInput.nextInt();



//         while (counter <= maxNumber)

//         {

//             int threeDivison;

//             int fiveDivison;



//             threeDivison = counter % 3;

//             fiveDivison = counter % 5;



//             if ((threeDivison == 0) && (fiveDivison == 0))

//             {

//                 System.out.println("Hurray #"+ counter); 

//             }            

//             counter = counter + 1;

//         }



//     }

// }
