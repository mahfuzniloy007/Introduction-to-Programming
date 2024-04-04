//Enhancing loop
public class EnhancingArray
{
    public static void main(String[] args) 
    {
        String[] NameOfPlayers = {"Messi", "Neymar", "Ronaldo", "Sakib", "Mbappe"};

        for (int i = 0; i < 5; i++) 
        {
            System.out.print(NameOfPlayers[i]+ " ");
        }
        System.out.println();
        for (int i = 0; i < NameOfPlayers.length; i++) 
        {
            System.out.print(NameOfPlayers[i]+ " ");
        }
        System.out.println();

        //Enhancing loop
        for (String myList: NameOfPlayers) 
        {
            System.out.print(myList+" ");
        }
    }
}
