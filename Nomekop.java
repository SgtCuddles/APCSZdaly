public class Nomekop{

   public static final int BASEATTACK = 200;
   public static final int BASEHP = 2;
   
   public static void main(String[] args){
      System.out.println("The attack for this pokemon at level 100 is " + atStat(BASEATTACK));
      System.out.println("The HP for this pokemon at level 100 is " + hpStat(BASEHP));
      

      
   }
   
   public static int atStat(int baseStat){
      return(baseStat*2 + 5);
   }
   
   public static int hpStat(int baseStat){
      return(110 + baseStat*2);
   }
}