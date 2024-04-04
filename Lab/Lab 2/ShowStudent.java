public class ShowStudent
{
   public static void main (String[] args)
   {
      Student david = new Student();
      david.setIdNumber(365);
      david.setPoints(75);
      david.setHours(20);

      david.showIdNumber();
      david.showPoints();
      david.showHours();
      System.out.println("The average grade point is " + david.getGradePoint());
   }
}