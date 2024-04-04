import java.time.LocalDate;

public class LocalDateDemo 
{
    public static void main(String[] args) 
    {
        LocalDate today = LocalDate.now();
        LocalDate graduationDate = LocalDate.of(2024, 04, 20);

        System.out.println("Today Date is " +today);
        System.out.println("My Graduation Date is " +graduationDate);
    }
    
}

