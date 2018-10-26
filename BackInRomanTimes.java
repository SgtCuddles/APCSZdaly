import java.util.Scanner;


public class BackInRomanTimes{

   public static void main(String[] args){
      
      Scanner getNum = new Scanner(System.in);
      System.out.print("What number do you need converted? : ");
      curseTheRomans(getNum.nextInt());
      getNum.close();
      
   }

   
   public static void curseTheRomans(int num){
   
      int thousands     = num/1000;
      int fiveHundreds  = (num - 1000*thousands)/500;
      int hundreds      = ((num - 1000*thousands)-500*fiveHundreds)/100;
      int fifties       = (((num - 1000*thousands)-500*fiveHundreds)-100*hundreds)/50;
      int tens          = ((((num - 1000*thousands)-500*fiveHundreds)-100*hundreds)-50*fifties)/10;
      int fives         = (((((num - 1000*thousands)-500*fiveHundreds)-100*hundreds)-50*fifties)-10*tens)/5;
      int ones          = ((((((num - 1000*thousands)-500*fiveHundreds)-100*hundreds)-50*fifties)-10*tens)-5*fives);
      
      char sym;
      String numeral = "";
      
      int goTo;
      
      for(int symbol = 0; symbol < 7; symbol++){
      if(symbol == 0){
         sym = 'M';
         goTo = thousands;
      }else if(symbol == 1){
         sym = 'D';
         goTo = fiveHundreds;
      }else if(symbol == 2){
         sym = 'C';
         goTo = hundreds;
      }else if(symbol == 3){
         sym = 'L';
         goTo = fifties;
      }else if(symbol == 4){
         sym = 'X';
         goTo = tens;
      }else if(symbol == 5){
         sym = 'V';
         goTo = fives;
      }else{
         sym = 'I';
         goTo = ones;
      }
         for(int i = 0; i < goTo; i++){
            numeral += sym;
         }
      }
      
      System.out.println(numeral);
   }
   
}