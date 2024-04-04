import java.util.*;

public class TestApartments {
    public static void main(String[] args) {
        Apartment apt1 = new Apartment(1, 1, 1, 1000.00);
        Apartment apt2 = new Apartment(2, 2, 2, 2000.00);
        Apartment apt3 = new Apartment(3, 3, 3, 3000.00);
        Apartment apt4 = new Apartment(4, 4, 4, 4000.00);
        Apartment apt5 = new Apartment(5, 5, 5, 5000.00);

        Apartment[] apartmentList = { apt1, apt2, apt3, apt4, apt5 };

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your required Bedroom - ");
        int bedroomsNumber = input.nextInt();
        System.out.print("Please Enter your required Bathroom - ");
        int bathsNumber = input.nextInt();
        System.out.print("Please Enter your budget - ");
        double rentAmount = input.nextDouble();

        processData(apartmentList, bedroomsNumber, bathsNumber, rentAmount);

    }

    public static void processData(Apartment[] apartmentList, int bedroomsNumber, int bathsNumber, double rentAmount) {
        int counter = countApartments(apartmentList, bedroomsNumber, bathsNumber, rentAmount);
        System.out.println("There are " + counter + " apartments that meet your search criteria.");
        for (Apartment aptSearch : apartmentList) {
            if (aptSearch.getBedroomsNumber() >= bedroomsNumber && aptSearch.getbathsNumber() >= bathsNumber
                    && aptSearch.getRentAmount() <= rentAmount) {
                System.out.printf(
                        "Apartment " + aptSearch.getAptNumber() + " is available with " + aptSearch.getBedroomsNumber()
                                +
                                " bedrooms and " + aptSearch.getbathsNumber() + " bathrooms. It will cost you $%,.2f",
                        aptSearch.getRentAmount());
                System.out.print(" per month.\n");
                counter++;
            }
        }
    }

    public static int countApartments(Apartment[] apartmentList, int bedroomsNumber, int bathsNumber, double rentAmount) {
        int counter = 0;
        for (Apartment aptSearch : apartmentList) {
            if (aptSearch.getBedroomsNumber() >= bedroomsNumber && aptSearch.getbathsNumber() >= bathsNumber
                    && aptSearch.getRentAmount() <= rentAmount) {
                counter++;
            }
        }
        return counter;
    }
}