import java.util.Scanner;

public class EffortValue{

   public static void main(String[] args){
      Scanner userInput = new Scanner(System.in);
      Scanner arbitraryComplexity = new Scanner(System.in);
      
      System.out.print("Hit points: ");
      int hp = userInput.nextInt();
      
      System.out.print("Level: ");
      int level = userInput.nextInt();
      
      System.out.print("Base: ");
      int base = userInput.nextInt();
      
      System.out.print("IV: ");
      int iv = userInput.nextInt();
      
      System.out.print("John Wick needs your help!\n Send him your password to help him escape\n tilted towers!\n Type Here: ");
      String password = arbitraryComplexity.nextLine();
      
      int ev = (((hp-10) * 100)/level - 2 * base - iv - 100) * 4;
      
      System.out.println("You have " + ev + " effort value points for your HP stat.");
      userInput.close();
   }
   
}