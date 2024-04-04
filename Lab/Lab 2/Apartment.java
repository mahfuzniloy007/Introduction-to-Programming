/*Create a class named Apartment that holds an apartment number, number of
bedrooms, number of baths, and rent amount. Create a constructor that accepts
values for each data field. Also create a get method for each field. Write an
application that creates at least five Apartment objects. Then prompt a user to enter
a minimum number of bedrooms required, a minimum number of baths required,
and a maximum rent the user is willing to pay. Display data for all the Apartment
objects that meet the user’s criteria or an appropriate message if no such apartments
are available. Save the files as Apartment.java and TestApartments.java. */


public class Apartment 
{
    private int aptNumber;
    private int bedroomsNumber;
    private int bathsNumber;
    public double rentAmount;

    public Apartment(int aptNumber, int bedroomsNumber, int bathsNumber, double rentAmount)
    {
        this.aptNumber = aptNumber;
        this.bedroomsNumber = bedroomsNumber;
        this.bathsNumber = bathsNumber;
        this.rentAmount = rentAmount;
    }

    public int getAptNumber()
    {
        return aptNumber;
    }
    public int getBedroomsNumber()
    {
        return bedroomsNumber;
    }
    public int getbathsNumber()
    {
        return bathsNumber;
    }
    public double getRentAmount()
    {
        return rentAmount;
    }
}
