public class Count1000{
   public static void main(String[] args){
      for(int thoosands = 0; thoosands <= 1000; thoosands+= 1000){
         for(int hundos = 0; hundos < 1000; hundos+= 100){
            for(int tens = 0; tens < 100; tens+= 10){
               for(int ones = 0; ones < 10; ones++){
                  if(thoosands + hundos + tens + ones <= 1000){
                     System.out.println(thoosands + hundos + tens + ones);
                     }
               }
            }
         }
      }
   }
}