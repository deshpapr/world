import java.util.Scanner;

class helloworld
{
   public static void main(String args[])
   {
      int x, y, z;
      System.out.println("Enter two integers to calculate their multiplication ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      y = in.nextInt();
      z = x * y;
      in.close();
      System.out.println("Sum of entered integers = "+z);
   }
}

