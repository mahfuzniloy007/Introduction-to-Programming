class ShowStudent2
{
   public static void main (String[] args)
   {
      Student david = new Student();
      david.showIdNumber();
      david.showPoints();
      david.showHours();
      System.out.println("The average grade point is " + david.getGradePoint());
   }
}