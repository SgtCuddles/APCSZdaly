import java.util.Scanner;
import java.util.Random;


public class PekemenBettle
{
   public static void main(String[] args)
   {
      //Random rand = new Random();
      //System.out.println((rand.nextInt(16)+85)/100.0);
      System.out.print(battleStart());
   }
   
   public static String[] battleStart()
   {
   
      String[] names = new String[]{"Dillon","Sans Undertale","Sam Hyde","Monkey","Metapod, but like a human one","Ratthew","Lightning McQueen","Piper and her sister Perri","just Perry","just Piper"};
      
      Random choose = new Random();
      String trainerName = names[choose.nextInt(10)];
      
      Scanner nameFetch = new  Scanner(System.in);
      
      System.out.print(trainerName + " wants to fight you.\n" + trainerName + " used Metapod\n Which pokemon will you use?");
      String name = nameFetch.nextLine();
      nameFetch.close();
      
      System.out.println("You chose " + name);
      String[] returnValue = new String[]{name, trainerName};
      return(returnValue);
   }
}