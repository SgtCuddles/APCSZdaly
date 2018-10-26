import java.util.Scanner;

public class AlGoreRhythm{
   public static void main(String[] args)
   {
   
      System.out.println(mightyMax());
      System.out.println(sovietSum());
   }
   
   public static int sovietSum()
   {
      Scanner frog = new Scanner(System.in);
      
      System.out.print("How many numbers will you be adding comrade? : ");
      int froggy = frog.nextInt();
      int toad = 0;
      
      for(int egg = 0; egg < froggy; egg++)
      {
         System.out.print("Next number : ");
         toad += frog.nextInt();
      }
      frog.nextLine();
      frog.close();
      System.out.println("Da, " + toad + " is a good number, the motherland will be proud.");
      return(toad);
   }
   
   public static int mightyMax()
   {
      Scanner beefy = new Scanner(System.in);
      
      System.out.print("How many numbers will you be checking bro? : ");
      int juiced = beefy.nextInt();
      System.out.print("What is the first number to check bro? : ");
      int buff = beefy.nextInt();
      
      for(int built = 1; built < juiced; built++)
      {
         System.out.print("What is the next number to check bro? : ");
         int jacked = beefy.nextInt();
         if(jacked > buff)
         {
            buff = jacked;
         } 
      }
      beefy.nextLine();
      beefy.close();
      System.out.println("Damn bro, looks like " + buff + " is the biggest around. Congrats.");
      return(buff);
   } 
}