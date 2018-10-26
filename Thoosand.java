public class Thoosand{
   public static void main(String[] args){
      for(int thoosands = 0; thoosands < 10; thoosands++){
         for(int hundos = 0; hundos < 10; hundos++){
            for(int tens = 0; tens < 10; tens++){
               for(int ones = 0; ones < 10; ones++){
                  if((thoosands * 1000 + hundos * 100 + tens * 10 + ones) <= 9){
                     System.out.println(ones);
                  }else if((thoosands * 1000 + hundos * 100 + tens * 10 + ones) <= 99){
                     System.out.println(tens + "" + ones);
                  }else if((thoosands * 1000 + hundos * 100 + tens * 10 + ones) <= 999){
                     System.out.println(hundos + "" + tens + ones);
                  }else if((thoosands * 1000 + hundos * 100 + tens * 10 + ones) <= 1000){
                     System.out.println(thoosands + "" + hundos + tens + ones);
                  }
               }
            }
         }
      }
   }
}