import java.util.Random;
import java.util.Scanner;

public class HeadsTailsGame{
   public static void main(String[] args){
   
   boolean guess;
   boolean coinFlip;
   
   Scanner scanner = new Scanner(System.in);
   
   System.out.println("=====================");
   System.out.println("**HEADS OR TAILS V1**");
   System.out.println("=====================");
   
   System.out.print("Enter TRUE for HEAD and FALSE for TAIL: ");
   guess = scanner.nextBoolean();
   
   if(guess){
      System.out.println("  You Guessed HEADS");
   }
   else{
      System.out.println("  You Guessed TAILS");
   }
   
   Random random = new Random();
   
   coinFlip = random.nextBoolean();
   
   System.out.println("---------------------");
   if(coinFlip){
     System.out.println("        HEADS");
   }
   else{
      System.out.println("       TAILS");
   }
   
   if(guess == coinFlip){
      System.out.println("  YOU GUESSED RIGHT");
   }
   else{
      System.out.println("  YOU GUESSED WRONG");
   }
   System.out.println("---------------------");
   
   scanner.close();
   
   
   
   }
}
