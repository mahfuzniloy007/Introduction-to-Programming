public class Student 
{
    
    private int idNumber;
    private int CreditHours;
    private int points;


    public Student() 
    {
        idNumber = 9999;
        CreditHours = 3;
        points = 12;
    }


    public void setIdNumber(int number) 
    {
        idNumber = number;
    }

    public int getIdNumber() 
    {
        return idNumber;
    }

    public void setHours(int number) 
    {
        CreditHours = number;
    }

    public int getHours() 
    {
        return CreditHours;
    }

    public void setPoints(int number) 
    {
        points = number;
    }

    public int getPoints() 
    {
        return points;
    }

    public void showIdNumber() 
    {
        System.out.println("ID Number is: "+idNumber);
    }

    public void showHours() 
    {
        System.out.println("Credit Hours: " + CreditHours);
    }

    public void showPoints() 
    {
        System.out.println("Points Earned: "+points);
    }

    public double getGradePoint() 
    {
        double getGradePoint = (double)points/CreditHours;
        return getGradePoint;
    }
}