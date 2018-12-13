import java.util.Random;
import java.util.Scanner;

class Main {
  //rock paper scissors with lying
  public static void main(String[] args) {
    boolean cont = true;
    int cpuChosen = 0;
    int playerChosen = 0;
    int playerWinner = 0;

    //bookkeeping 0 = player score
    //bookkeeping 1 = computer score
    //bookkeeping 2 = round number
    int[] bookKeeping = {0,0,1};
 
    Random rand = new Random();

    Scanner input = new Scanner(System.in);

    while(cont)
    {
      System.out.println("It is now round " + bookKeeping[2]);
      playerChosen = pTurn();
      cpuChosen = cTurn();
      //terrible if statement usage just because I need to meet the requirement
      if((cpuChosen == playerChosen) && cpuChosen == 0)
      {
        System.out.print("Both of you played rock, it's a draw");
        playerWinner = 2;
      }
      else if((cpuChosen == playerChosen) && cpuChosen == 1)
      {
        System.out.print("Both of you played paper, it's a draw");
        playerWinner = 2;
      }
      else if((cpuChosen == playerChosen) && cpuChosen == 2)
      {
        System.out.print("Both of you played scissors, it's a draw");
        playerWinner = 2;
      }
      else if(cpuChosen == 0 && playerChosen == 1)
      {
        System.out.print("the computer chose rock and you chose paper");
        playerWinner = 1;
      }
      else if(cpuChosen == 0 && playerChosen == 2)
      {
        System.out.print("the computer chose rock and you chose scissors");
        playerWinner = 0;

      }
      else if(cpuChosen == 1 && playerChosen == 0)
      {
        System.out.print("the computer chose paper and you chose rock");
        playerWinner = 0;
      }
      else if(cpuChosen == 1 && playerChosen == 2)
      {
        System.out.print("the computer chose paper and you chose scissors");
        playerWinner = 1;
      }
      else if(cpuChosen == 2 && playerChosen == 0)
      {
        System.out.print("the computer chose scissors and you chose rock");
        playerWinner = 1;
      }
      else if(cpuChosen == 2 && playerChosen == 1)
      {
        System.out.print("the computer chose scissors and you chose paper");
        playerWinner = 0;
      }

      int goOn = 0;

      //if(playerWinner == 0)
      //{
        //give option to lie
        //if lie successful add 1 point to h else add 2 points to c
      //}
      if(playerWinner == 1)
      {
        boolean cpuLies = cpuLie();
        if(cpuLies)
        {
          System.out.print("The computer wins!\nDo you want to continue?");
          goOn = input.nextInt();
          if(goOn == 1)
          {
            bookKeeping[0] += 1;
            System.out.print("You caught me. Do you want to continue?");
            if(input.nextLine().equals("yes"))
            {
              cont = true;
            }
            else
            {
              cont = false;
            }
          }
          else if(goOn == 0)
          {
            bookKeeping[1] += 1;
            cont = false;
          }
          else
          {
            bookKeeping[1] += 1;
            cont = true;
            //computer gets a point then game continues
          }
        }
      }
      else{
      System.out.print("Do you want to continue?");
      goOn = input.nextLine();
        if(goOn.equals("yes"))
        {
          cont = true;
        }
        else
        {
          cont = false;
        }
      }
      System.out.println("Your score is : " + bookKeeping[0] +"\nThe computer's score is" + bookKeeping[1]);
      bookKeeping[2] += 1;
    }
    input.close();
  }

  public static int cTurn()
  {
    Random rand = new Random();
    int chosen = rand.nextInt(3);
    System.out.print("The computer has chosen ");
    if(chosen == 0)
    {
      System.out.println("rock");
    }
    else if(chosen == 1)
    {
      System.out.println("paper");
    }
    else if(chosen == 2)
    {
      System.out.println("scissors");
    }
    else
    {
      System.out.println("VOID");
    }
    return(chosen);
  }

  public static int pTurn()
  {
    Scanner input = new Scanner(System.in);
    System.out.print("What do you choose? : ");
    String chosen = input.nextLine();
    int returnChosen = 0;
    if(chosen.toLowerCase().equals("rock"))
    {
      returnChosen = 0;
    }
    else if(chosen.toLowerCase().equals("paper"))
    {
      returnChosen = 1;
    }
    else if(chosen.toLowerCase().equals("scissors")) 
    {
      returnChosen = 2;
    }
    else
    {
      pTurn();
    }
    input.close();
    return(returnChosen);
  }

  public static boolean cpuLie()
  {
    Random rand = new Random();
    int doesItLie = rand.nextInt(4);
    if(doesItLie == 3)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}