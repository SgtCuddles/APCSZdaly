public class forLoopsInput{
   
   public static final int LIMIT = 9;
   public static final char SYMBOL = '%';
   
   public static void main(String[] args){
      partA(LIMIT);
      partB(LIMIT, SYMBOL);
      partC(LIMIT, SYMBOL);
      partD(LIMIT, SYMBOL);
   }
   
   public static void partA(int limit){
      for(int i = 1; i <= limit; i++){
         for(int goTo = 1; goTo <= i; goTo++){
            System.out.print(goTo);
         }
         System.out.println();
      }
   }
   
   public static void partB(int limit, char symbol){
      for(int i = 1; i<= limit; i++){
         String thing = ""; 
         for(int goTo = 1; goTo <= i; goTo++){
            System.out.print(goTo);
         }
         for(int goTo = 1; goTo <= (limit - i); goTo++){
            thing += symbol;
         }
         System.out.println(thing);
      }
   }
   
   public static void partD(int limit, char symbol){
      for(int i = 0; i< limit; i++){
         String thing = ""; 
         for(int goTo = 1; goTo <= i; goTo++){
            System.out.print(" ");
         }
         for(int goTo = 1; goTo <= (limit - i); goTo++){
            thing += symbol;
         }
         System.out.println(thing);
      }
   }
   
   public static void partC(int limit, char symbol){
      for(int i = 0; i< limit; i++){
         String thing = ""; 
         for(int goTo = 1; goTo <= i; goTo++){
            System.out.print(goTo);
         }
         for(int goTo = 1; goTo <= (limit - i); goTo++){
            thing += symbol;
         }
         System.out.println(thing);
      }
   }
   
}